import axios from 'axios';


export default {

  getBreweries() {
    return axios.get('/breweries');
  },

  addBrewery(brewery) {
    return axios.post('/brewery', brewery);
  },

  updateBrewery(brewery, breweryId) {
    return axios.put(`/brewery/${breweryId}`, brewery);
  }

}