<template>
  <div class="home">
    <h1>Home</h1>
    <h3>This application shows information about breweries and beers. Beer lovers can view information about breweries and beers, while brewers can update the information about their products. Administrators can add breweries to the system.</h3>
   
   <button><h2> <brewery-list/> </h2></button>
   <!-- <p>You must be authenticated to see this</p> -->
  </div>
</template>

<script>
import BreweryList from '@/components/BreweryList';


export default {
components: {
    BreweryList

  },
  methods: {
    
  },

  name: "home"
};
</script>

