<template>
  <div class="app">
    <div class="container">
  
      <h1><img src='~@/assets/images/Brew Crew Cincinnati.png'></h1>
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

img h1{
  
  display: flex;
  align-items: center;
  justify-content: center }

Navigationbody {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,
    'Helvetica Neue', Arial, 'Noto Sans', sans-serif, 'Apple Color Emoji',
    'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';

}

body {
  background-image:url('~@/assets/images/BewitchedRingedIvorybilledwoodpecker-size_restricted.gif');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: auto; /* You must set a specified height */
  background-position: top; /* Center the image */

  background-size:contain; /* Resize the background image to cover the entire container */
}

h1 {

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
 
<<<<<<< HEAD
=======
 .app{
   
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
 }
>>>>>>> c80f9f49c6b4435017021321dad2acac51180836
nav {
  background: transparent;
  
}


</style>
