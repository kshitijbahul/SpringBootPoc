//'use strict;'
//const gulp = require('gulp');
//const devBuild = (process.env.NODE_ENV !== 'production');
//const folder = {
//    src: 'src/main/resources/static',
//    build: 'build/'
//  };
var gulp = require('gulp');

gulp.task('default', function() {
  if(process.env.NODE_ENV === 'production') {
    console.log('gulp runs as expected on production');
  } else {
    console.log('gulp runs as expected');
  }
});