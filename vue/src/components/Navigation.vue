<template>
  <div class="nav">
      <button v-if="$store.state.token != ''">
    <router-link v-bind:to="{ name: 'home' }"
      >Home</router-link
    > </button>
    &nbsp;
    
      <button v-if="$store.state.token != ''">
    <router-link
      
      v-bind:to="{ name: 'logout' }"
      >Logout</router-link
    > </button>
&nbsp;

<button v-if="$store.state.token != ''"> 
    <router-link v-bind:to="{ name: 'add-brewery'}">
        Add Brewery
    </router-link>
</button>
&nbsp;



    <router-view />
  </div>
</template>

<script>
export default {
  name: "navigation",
};
</script>

<style>
.nav {
    height: 100%;
    
}
</style>