<template>
<div>
    <span class="highlight-white">
    This is our add brewery page!
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

  name: "add-brewery"
};

</script>

<style>

</style>