import React from "react";
// import moment from "moment";

const Artist = (props) => {

  if(!props.artist){
    return null;
  }

  const id = props.artist.id
  const artistName = props.artist.name;
  const artistCountry = props.artist.country;


  const artist_singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
      return(
        <li key= {singleEvent.id} >
        <div className="artist-singleEvent-container">
        {singleEvent.id}

        <div>
        {' '}{singleEvent.title} in:{' '}{singleEvent.location} at:{' '}{singleEvent.venue} on:{' '} {singleEvent.date} {' '}{singleEvent.time}
        </div>
        </div>
        </li>
      )
    })

  const artist_groups = props.artist.groups.map((group, index) => {
    return(
      <li key={group.id} >
      <div className="artist-singleEvent-container">
      {group.id}

      <div>
      {' '}{group.name}
      </div>
      </div>
      </li>
    )
  })

  return(
    <div className = "single-artist">
      <div className = "details">
      <ul>
        <div>
        <li>Name:   {' '}<a href={'/artists/'+id}>{artistName}</a></li>
        </div>
        <div>
        <li>Country:   {' '}{artistCountry}</li>
        </div>
        <div>
        </div>
        <h4>Participated in events:</h4>
        <div>
          <div>
          <ul>{artist_singleEvents}</ul>
          </div>
        </div>
        <h4>Member of groups:</h4>
        <div>
          <div>
          <ul>{artist_groups}</ul>
          </div>
        </div>

      </ul>
      </div>
    </div>
  )
}

export default Artist;


// const singleEvent = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.title} {singleEvent.location} {singleEvent.venue}</ul>
// })
//
// const location = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.location}</ul>
// })
//
// const venue = props.artist.singleEvents.map((singleEvent, index) => {
//   return <ul key={index}>{singleEvent.venue}</ul>
// })
//
// const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
//   return singleEvent.date
// })
//
// const time = props.artist.singleEvents.map((singleEvent)=>{
//   return singleEvent.time
// })
// const slicedDate = dateBasic.slice(0,10)
//
// const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
// const time = moment(slicedDate).format('hh:mm z','Europe/London');



// const groups = props.artist.groups.map((group, index)=>{
//   return <ul key={index}>{group.name}</ul>
// })
