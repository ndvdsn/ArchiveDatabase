import React from "react";
import Request from "../../helpers/request";
import DocumentList from "../../components/documents/DocumentList";

class DocumentContainer extends React.Component{
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
    })
  }
  
  render(){
    console.log(this.state.documents);
    return (
      <>
      <h1> Documents </h1>
      <div className = "documents-container">
      <DocumentList documents={this.state.documents}/>
      </div>
      </>
    )
  }
}
export default DocumentContainer;
