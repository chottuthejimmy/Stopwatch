wreset = (Button)findViewById(R.id.wreset);
wreset.setOnClickListener(new OnClickListener() {

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        txtCount.setText(String.valueOf(0));
    }