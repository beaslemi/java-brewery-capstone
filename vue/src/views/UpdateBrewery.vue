<template>
<div>
    <span class="highlight-white">
    This is our update brewery page!
    </span>
  <div>
      <brewery-form/>
  </div>
 
  </div>
</template>

<script>
import BreweryForm from '@/components/BreweryForm';


export default {

components: {
    BreweryForm,


  },

  name: "update-brewery"
};

</script>

<style>

</style>