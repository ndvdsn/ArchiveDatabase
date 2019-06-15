import React from "react";
import Document from "./Document";

const DocumentList = (props) => {

  if (props.documents == null || props.documents.length ===0){
    return <p> loading...</p>
  }

  const documents = props.documents.map((document_)=>{
    return(
      <li key = {document_.id} className = "document-item">
      <Document document_ = {document_}/>
      </li>
    )
  })

  return (
    <div>
    <ul>
    {documents}
    </ul>
    </div>
  )
};

export default DocumentList
