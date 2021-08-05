<template>
  <div>
      <div v-for="breweries in this.$store.state.breweries" v-bind:key="breweries.id" class="highlight-white"></div>
      {{breweries.name}}
      {{breweries.website}}
      {{breweries.phone}}
      {{breweries.history}}
      {{breweries.address}}
      {{breweries.hoursOfOperation}} <!-- brewery info goes here -->
  </div>
</template>

<script>
//import breweryService from '../services/BreweryService';

export default {
data() {
    return {
      newBrewery: {}
      };
  },
  name: "brewery-info"
}
</script>

<style>

</style>