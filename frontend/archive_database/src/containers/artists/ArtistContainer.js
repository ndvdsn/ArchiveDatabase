import React from "react";
import Request from "../../helpers/request";

class ArtistContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      artists:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/artists').then(data => {
      this.setState({artists:data._embedded.artists})
    })
  }

  render(){
    return (
      <>
      <h1> Artists <h1/>
      <div classname = "artist-container">

      <div/>
      </>
    )
  }
}
export default ArtistContainer;
