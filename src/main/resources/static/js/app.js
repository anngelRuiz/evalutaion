var app = angular.module('myApp', [])
    .controller('usersController', function($scope, $http, $window){

        $scope.users = {
            id : null,
            nombre : null,
            ap : null,
            am : null,
            email : null,
            telefono : null,
        };

        $scope.users = [];

        $scope.addUser = (users) => {
            $http.post('/users/add', users).then(
                (response) => {
                    Swal.fire({
                      title: 'Operacion Completada!',
                      text: 'Usuario agregado',
                      icon: 'success',
                      confirmButtonText: 'Cool'
                    })
                    list();
                }
            );
        }

        $scope.edit = (user) => {
            $http.put('/users/edit/' + user.id, user).then(
                (response) => {
                    Swal.fire(
                        'Operacion completada!',
                        'Usuario Actualizado',
                        'info'
                    )
                    list();
                },
                (response) => {
                    Swal.fire(
                        'Error!',
                        'No se pudo completar la tarea' + response.data,
                        'error'
                    )
                }
            );
        }

        $scope.delete = (user) => {
            $http.delete('/users/delete/' + user.id).then((response) => {
                Swal.fire(
                    'Operacion completada!',
                    'Usuario elminado',
                    'success'
                )
                list();
            });
        };

        function list(){
            $http.get('/users/list').then(
                (response) => {
                    $scope.users = response.data;
                },
                (response) => {
                    $window.alert('Not information yet!');
                });
        }

        $scope.selectEdit= (user) => {
            $scope.user = user;
        }

        list();

})

function validate(evt) {
  var theEvent = evt || window.event;

  if (theEvent.type === 'paste') {
      key = event.clipboardData.getData('text/plain');
  } else {
      var key = theEvent.keyCode || theEvent.which;
      key = String.fromCharCode(key);
  }
  var regex = /[0-9]|\./;
  if( !regex.test(key) ) {
    theEvent.returnValue = false;
    if(theEvent.preventDefault) theEvent.preventDefault();
  }
}

//Swal.fire({
//  title: 'Operacion Completada!',
//  text: 'Usuario agregado',
//  icon: 'success',
//  confirmButtonText: 'Cool'
//})