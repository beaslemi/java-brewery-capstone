<template>
  <div class="highlight-white">
      <router-link v-for="breweries in this.$store.state.breweries" v-bind:key="breweries.id" >{{breweries}}</router-link>
      Brewery List goes here when connected to server!!!
  </div>
</template>

<script>
import breweryService from '../services/BreweryService';

export default {
    data() {
    return {
      newBrewery: {}
      };
  },

  created() {
    this.retrieveBreweries();

  },

  methods: {

    retrieveBreweries() {
        breweryService.getBreweries().then(response=>{
            this.$store.commit("SET_BREWERIES", response.data);
        })
    },
     
    saveNewBrewery() {}

  }
};
</script>

<style>

</style>