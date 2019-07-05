import React from "react";
import Request from "../../helpers/request";
import DigitalAssetList from "../../components/digitalAssets/DigitalAssetList";

class DigitalAssetContainer extends React.Component{
  constructor(props){
    super(props);
    this.state = {
      documents:[]
    }
  }
  componentDidMount(){
    const request = new Request();
    request.get('api/documents')
    .then(data => {
      this.setState({documents:data._embedded.documents})
      console.log(this.state.documents);
    })
  }

  render(){
    console.log(this.state.documents);
    return (
      <>
      <h1> Documents </h1>
      <div className = "digitalAssets-container">
      <DigitalAssetList digitalAssets={this.state.documents}/>
      </div>
      </>
    )
  }
}
export default DigitalAssetContainer;
