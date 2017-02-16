var app = angular.module('MyApp', []);

app.controller("mainController", function($scope) {

	$scope.reviewObj = {}
	$scope.reviewObj.id = "";
	$scope.reviewObj.brandName = "";
	$scope.reviewObj.comment = "";
	$scope.reviewList = [];

	$scope.getAllRecords = function() {
		$http.get("/getAll").then(function success(response) {
			$scope.reviewList = response.data;

		}, function error(errorResp) {
			console.log('Error ', errorResp);
		});
	}

	$scope.saveReviewForm = function() {
		$http.post("/add", $scope.reviewList).then(function success(response) {
			console.log(response.data);

		}, function error(errorResp) {
			console.log('Error ', errorResp);
		});
	}
})