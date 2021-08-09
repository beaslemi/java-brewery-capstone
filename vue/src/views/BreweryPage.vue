<template>
<div>
    <span class="highlight-white">
    This is our brewery page!
    </span>
 
  <div>
      <brewery-info/>
  </div>
  </div>
</template>

<script>

import BreweryInfo from '@/components/BreweryInfo';

export default {
components: {
 
    BreweryInfo

  },

  name: "brewery-page"
};

</script>

<style>

</style>