<template>
  <div>
    <span class="highlight-white">
      This is our brewery page!
      <br />
      
    </span>
 <div>

{{brewery.name}}
{{brewery.website}}

 </div>
    <div>
      <!-- <brewery-info/> -->
    </div>
  </div>
</template>

<script>
//import BreweryInfo from "@/components/BreweryInfo";

export default {
 name: "brewery-page",
  
  computed: {
    brewery() {
      console.log(`${this.$route.params.breweryId}`);
      return this.$store.state.breweries.find(brewery => brewery.id === this.$route.params.breweryId);
    },
  }
};

</script>

<style>
</style>