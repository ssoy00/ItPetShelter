// 모달 표시
const result = document.querySelector(".modal").getAttribute("data-result")
const modal = new bootstrap.Modal(document.querySelector(".modal"))
if(result){
    modal.show()
}

// 초기화 버튼 클릭 시 동작
document.querySelector(".clearBtn").addEventListener("click", function (e) {
    e.preventDefault()
    e.stopPropagation()
    self.location = "/board/list"
})

// 페이지네이션 클릭 시 동작
document.querySelector(".pagination").addEventListener("click", function (e) {
    e.preventDefault()
    e.stopPropagation()

    const target = e.target
    if (target.tagName !== 'A') {
        return
    }
    const num = target.getAttribute("data-num")
    const link = document.querySelector("form").getAttribute("data-link")
    const formObj = document.querySelector("form")
    formObj.innerHTML += `<input type="hidden" name="page" value="${num}">`
    formObj.submit()
}, false)
