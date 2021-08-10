<template>
    <form action="">
      <div class="form-element">
        <label for="brewery-name" class="highlight-white">Brewery Name: </label>
        <input id="brewery-name" type="text" v-model="brewery.name">
      </div>
      <div class="form-element">
        <label for="brewery-website" class="highlight-white">Website URL: </label>
        <input id="brewery-website" type="text" v-model="brewery.website">
      </div>
      <div class="form-element">
        <label for="brewery-phone" class="highlight-white">Phone: </label>
        <input id="brewery-phone" type="text" v-model="brewery.phone">
      </div>
      <div class="form-element">
        <label for="brewery-history" class="highlight-white">History: </label>
        <textarea id="brewery-history" v-model="brewery.history"></textarea>
      </div>
      <div class="form-element">
        <label for="brewery-address" class="highlight-white">Address: </label>
        <textarea id="brewery-address" v-model="brewery.address"></textarea>
      </div>
      <div class="form-element">
        <label for="brewery-hours" class="highlight-white">Hours of Operation: </label>
        <textarea id="brewery-hours" v-model="brewery.hoursOfOperation"></textarea>
      </div>
      <div class="actions">
      &nbsp;<button v-on:click.prevent="resetForm" type="cancel">Cancel</button>&nbsp;
      &nbsp;<button v-on:click.prevent="createBrewery" >Add Brewery</button>
      &nbsp;<button v-on:click.prevent="reviseBrewery" >Update Brewery</button>
    </div>
    </form>
</template>

<script>
import breweryService from '../services/BreweryService';

export default {
  
data() {
    return {
      brewery: {}
      };
  },

created(){
  console.log(`in brewery with ${this.$route.params.breweryId}`);
  this.brewery = this.$store.state.breweries.find(brewery =>{
    if(this.$route.params.breweryId == brewery.id){
      return true;
    } return false;
    } 
  );
},

  props: {
    
    breweryID: {
      type: Number,
      default: 0
    },
    
  }, 

  methods: {

  createBrewery() {
      const newBrewery = {
        breweryId:Number(this.$route.params.breweryID),
        name: this.brewery.name,
        website: this.brewery.website,
        phone: this.brewery.phone,
        history: this.brewery.history,
        address: this.brewery.address,
        hoursOfOperation: this.brewery.hoursOfOperation
      };

      if (this.breweryID === 0) {
        // add
        breweryService
          .addBrewery(newBrewery)
          .then(response => {
            if (response.status == 201) {
              this.$router.push('/');
            
            }
          })
          .catch(error => {
            this.handleErrorResponse(error, "adding");
          });
      } 
    },
  reviseBrewery(brewery) {
      
        brewery.name = this.brewery.name;
        brewery.website = this.brewery.website;
        brewery.phone = this.brewery.phone;
        brewery.history = this.brewery.history;
        brewery.address = this.brewery.address;
        brewery.hoursOfOperation = this.brewery.hoursOfOperation;
        breweryService
          .updateBrewery(brewery)
          .then(response => {
            if (response.status == 200) {
              this.$router.push('/');
            }
          })
          .catch(error => {
            this.handleErrorResponse(error, "updating");
          });
        }    
        
      },
    
    resetForm() {
      this.brewery = {};
    },

  

  name: "brewery-form"

};
</script>

<style>

</style>