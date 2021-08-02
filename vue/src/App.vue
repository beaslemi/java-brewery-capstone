<template>
  <div class="app">
    <div class="container">
      <h1>Brewery Finder</h1>
      <h2></h2>
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>
      
      &nbsp;<router-link v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<script>
export default {};
</script>

<style>
body {
  font-family: system-ui, -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,
    'Helvetica Neue', Arial, 'Noto Sans', sans-serif, 'Apple Color Emoji',
    'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji';

  background-image:url('~@/assets/images/Beer.jpg');
  background-color: #cccccc; /* Used if the image is unavailable */
  height: 500px; /* You must set a specified height */
  background-position: center; /* Center the image */
  background-repeat: no-repeat; /* Do not repeat the image */
  background-size: cover; /* Resize the background image to cover the entire container */
}

h1 {
font-size: 600%;
color: rgb(223, 145, 28);
font-family: Century Gothic, Helvetica, sans-serif;
}

h2 {
  font-size: 300%;
  color: azure;
}

 


</style>