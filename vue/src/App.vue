<template>
  <div class="app">
    <div class="container">
      <h1>Brewery Finder</h1>
      <navigation/> 
  </div>
  </div>
</template>

<script>
import Navigation from './components/Navigation.vue';


export default {
components: {
  Navigation
}

};
</script>

<style>

Navigationbody {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,
    'Helvetica Neue', Arial, 'Noto Sans', sans-serif, 'Apple Color Emoji',
    'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';

}

body {
   background-image:url('~@/assets/images/Beer.jpg');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 100%; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover; /* Resize the background image to cover the entire container */
}

h1 {
font-size: 600%;
color: rgb(223, 145, 28);
font-family: Century Gothic, Helvetica, sans-serif;
filter: drop-shadow(5px 5px 4px black);
}

h2 {
  font-size: 300%;
  color: white;
}

.sr-only {
  font-size: 100%;
  color: white;
}

.highlight-white{
  color: white;
  font-size: 150%;
}

p{
  color: white;
}
 
nav {
  background: transparent;
  
}

</style>
