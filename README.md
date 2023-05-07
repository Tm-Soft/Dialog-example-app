        /*
            Dialog 객체 생성
            Title, Content, positiveText, negativeText
            메서드를 통해 해당 Dialog 객체의 상태를 수정할 수 있습니다.

            setTitleColor, setContentColor, setPositiveTextColor, setNegativeTextColor
            위 메서드를 통해 각 글자의 색상을 변경할 수 있습니다.

            showXXXX() 호출 하기 전 Positive / Negative Listener
            등록하여 버튼이 클릭 되었을 때 활동을 지정할 수 있습니다.
         */
        val dialogObj = Dialog
                            .with(this)
                            .title("Dialog Default Title")
                            .content("Default Content")
                            .positiveText("OK")
                            .negativeText("Cancel")

        binding.btnOneButtonDialog.setOnClickListener {
            dialogObj
                .positiveListener {
                    Toast.makeText(this, "Positive Button Click", Toast.LENGTH_LONG).show()
                }
                .showOneButtonDialog()
        }

        binding.btnTwoButtonDialog.setOnClickListener {
            dialogObj
                .positiveListener {
                    Toast.makeText(this, "Positive Button Click", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Negative Button Click", Toast.LENGTH_LONG).show()
                }
                .showTwoButtonDialog()
        }

        binding.btnInputStringButtonDialog.setOnClickListener {
            dialogObj
                .stringCallbackListener { text ->
                    Toast.makeText(this, "Input String : $text", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Negative Button Click", Toast.LENGTH_LONG).show()
                }
                .showEditTextDialog()
        }

        binding.btnSelectListButtonDialog.setOnClickListener {
            dialogObj
                .selectTitleList(
                    listOf("첫 번째", "두 번째", "세 번째")
                )
                .selectContentList(
                    listOf("첫 번째 설명", "두 번째 설명", "세 번째 설명")
                )
                .stringCallbackListener { text ->
                    Toast.makeText(this, "Input String : $text", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Negative Button Click", Toast.LENGTH_LONG).show()
                }
                .showSelectDialog()
        }

        binding.btnKakaoLoginButtonDialog.setOnClickListener {
            dialogObj
                .positiveListener {
                    Toast.makeText(this, "Kakao App Login", Toast.LENGTH_LONG).show()
                }
                .negativeListener {
                    Toast.makeText(this, "Kakao Web Other Login", Toast.LENGTH_LONG).show()
                }
                .showKakaoLoginDialog()
        }
