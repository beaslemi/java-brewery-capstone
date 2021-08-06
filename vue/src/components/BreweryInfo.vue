<template>
  <div>
      <div v-for="breweries in this.$store.state.breweries" v-bind:key="breweries.id" class="highlight-white">
      {{breweries.website}} 
      <!--need to fix - brewery info not loading
      should we link to different update page or swap out components? if so how?-->
      </div>
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
  retrieveBreweries() {
        breweryService.getBreweries().then(response=>{
            if (response.status == 200){
                this.$store.commit("SET_BREWERIES", response.data);
            }
        })
    },
  name: "brewery-info"
}
</script>

<style>

</style>