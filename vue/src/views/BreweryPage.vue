<template>
<div>
    <span class="highlight-white">
    This is our brewery page!
    </span>
    
  <div>
      <brewery-info/>
  </div>
  <div>
      <brewery-form/>
  </div>
  </div>
</template>

<script>
import BreweryForm from '@/components/BreweryForm';
import BreweryInfo from '@/components/BreweryInfo';

export default {
components: {
    BreweryForm,
    BreweryInfo

  },

  name: "brewery-page"
};

</script>

<style>

</style>