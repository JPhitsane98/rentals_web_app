import React from 'react'
import image1 from '../Images/image1.png'

export default function Post(props) {
  return (
    <div className='d-flex flex-wrap flex container'>
      <div className='main_image'>
        <img src={image1} className='img-thumbnail images '/>
      </div>
      <div className='detailed_Info'>
        <div>
          <h1>House</h1>
          <h3>Address</h3>
        </div>
      </div>
    </div>
  )
}
