import React from "react";
import Request from "../../helpers/request";
import ArtistList from "../../components/artists/ArtistList";

class ArtistContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      artistsArray:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/artists').then(data => {
      this.setState({artistsArray:data._embedded.artistsArray})
    })
  }

  render(){
    return (
      <>
      <h1> Artists </h1>
      <div classname = "artist-container">

      </div>
      </>
    )
  }
}
export default ArtistContainer;
