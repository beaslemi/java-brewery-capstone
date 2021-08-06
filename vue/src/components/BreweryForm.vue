<template>
    <form action="">
      <div class="form-element">
        <label for="brewery-name" class="highlight-white">Brewery Name: </label>
        <input id="brewery-name" type="text" v-model="newBrewery.name">
      </div>
      <div class="form-element">
        <label for="brewery-website" class="highlight-white">Website URL: </label>
        <input id="brewery-website" type="text" v-model="newBrewery.website">
      </div>
      <div class="form-element">
        <label for="brewery-phone" class="highlight-white">Phone: </label>
        <input id="brewery-phone" type="text" v-model="newBrewery.phone">
      </div>
      <div class="form-element">
        <label for="brewery-history" class="highlight-white">History: </label>
        <textarea id="brewery-history" v-model="newBrewery.history"></textarea>
      </div>
      <div class="form-element">
        <label for="brewery-hours" class="highlight-white">Hours of Operation: </label>
        <textarea id="brewery-hours" v-model="newBrewery.hoursOfOperation"></textarea>
      </div>
      <div class="actions">
      <button v-on:click.prevent="resetForm" type="cancel">Cancel</button>&nbsp;
      &nbsp;<button>Add</button>
    </div>
      

    </form>
</template>

<script>
import breweryService from '../services/BreweryService';

export default {
data() {
    return {
      newBrewery: {
        id:"",
        name:"",
        website:"",
        phone:"",
        history:"",
        address:"",
        hoursOfOperation:""
      }
      };
  },

  methods: {

    saveNewBrewery() {
      breweryService.addBreweries().then(response=>{
            this.$store.commit("SET_BREWERIES", response.data);
            this.$router.push({name:'home'})
        })
    },
    resetForm() {
      this.newBrewery = {};
    }

  },

  name: "brewery-form"

};
</script>

<style>

</style>