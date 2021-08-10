<template>
  <div class="nav">
    <button v-if="$store.state.token != ''">
      <router-link v-bind:to="{ name: 'home' }">Home</router-link>
    </button>
    &nbsp;

    <button v-if="$store.state.token != ''">
      <router-link v-bind:to="{ name: 'logout' }">Logout</router-link>
    </button>
    &nbsp;

    <button v-if="$store.state.token != ''">
      <router-link v-bind:to="{ name: 'beers' }">Beers</router-link>
    </button>
    &nbsp;

    <button v-if="isBrewer">
      <router-link v-bind:to="{ name: 'add-brewery' }">
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

computed:{
  isBrewer(){
    if (this.$store.state.user.authorities == undefined){
      return false;
    }else if (this.$store.state.user.authorities[0].name === "ROLE_BREWER"){
      return true;
      }
      return false;
    }
  }
}
</script>

<style>
.nav {
  height: 100%;
   text-align: center;
}
</style>