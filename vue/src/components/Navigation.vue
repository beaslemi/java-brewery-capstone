<template>
  <div class="nav-x">
    <br>
    <router-link v-bind:to="{ name: 'home' }">
      <button class="rounded" v-if="$store.state.token != ''">Home</button>
    </router-link>
    &nbsp;
    <router-link v-bind:to="{ name: 'logout' }">
      <button class="rounded" v-if="$store.state.token != ''">Logout</button>
    </router-link>
    &nbsp;
    <router-link v-bind:to="{ name: 'beers' }">
      <button class="rounded" v-if="$store.state.token != ''">Beers</button>
    </router-link>
    &nbsp;
    <router-link v-bind:to="{ name: 'add-brewery' }">
      <button class="rounded" v-if="isBrewer">Add Brewery</button>
    </router-link>
    &nbsp;

    <router-view />
  </div>
</template>

<script>
export default {
  name: "navigation",

  computed: {
    isBrewer() {
      if (this.$store.state.user.authorities == undefined) {
        return false;
      } else if (this.$store.state.user.authorities[0].name === "ROLE_BREWER") {
        return true;
      }
      return false;
    },
  },
};
</script>

<style>
.nav {
  height: 100%;
  text-align: center;
}
</style>