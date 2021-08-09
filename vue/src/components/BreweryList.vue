<template>
  <div >
      <router-link :to="{ name: 'brewery', params: { breweryId: breweries.id }}" v-for="breweries in this.$store.state.breweries" v-bind:key="breweries.id" class="highlight-white">
      {{ breweries.name }} <br>
      </router-link>
      <!--Brewery List goes here when connected to server!!!-->
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
            if (response.status == 200){
                this.$store.commit("SET_BREWERIES", response.data);
            }
        })
    }

  }
};
</script>

<style>

</style>