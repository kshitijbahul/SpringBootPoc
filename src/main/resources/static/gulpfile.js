'use strict;'
//const gulp = require('gulp');
//const devBuild = (process.env.NODE_ENV !== 'production');
const folder = {
    src: 'src/main/resources/static',
    build: 'build/'
};
var gulp = require('gulp');
var sass = require('gulp-sass');
var path = require('path');

gulp.task('sass', function(){
  console.log('In the css task',folder.src,path.join(__dirname,'/scss/**/*.scss'));
  return gulp.src(path.join(__dirname,'/scss/**/*.scss'))
      .pipe(sass().on('error',sass.logError))
      .pipe(gulp.dest(path.join(__dirname,'/css')));
});



gulp.task('testGulp', function() {
  if(process.env.NODE_ENV === 'production') {
    console.log('gulp runs as expected on production');
  } else {
    console.log('gulp runs as expected');
  }
});
gulp.task('default',['testGulp','sass']);