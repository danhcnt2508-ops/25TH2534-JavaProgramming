# ☕ Java Programming Masterclass

> Kho lưu trữ toàn bộ mã nguồn bài tập, đồ án thực hành và bài tập về nhà thuộc học phần **Lập trình Java** (Mã học phần: `25TH2534-JavaProgramming`).

Mã nguồn được tổ chức cấu trúc thư mục rõ ràng theo từng mốc tiến độ học tập từ cơ bản đến nâng cao.

---

## 🛠️ Công nghệ & Môi trường phát triển

Để chạy và phát triển dự án này, hệ thống của bạn cần được cấu hình các thành phần sau:

| Thành phần | Công cụ / Phiên bản | Ghi chú |
| :--- | :--- | :--- |
| **Ngôn ngữ** | Java | Hỗ trợ tính năng Java mới |
| **Môi trường chạy (JRE)** | JavaSE-21, JavaSE-20, JavaSE-17 | Cấu hình linh hoạt theo từng Project |
| **Công cụ phát triển (IDE)**| Eclipse / IntelliJ IDEA / VS Code | Khuyến khích dùng Eclipse |

---

## 📂 Lộ trình thực hành & Cấu trúc mã nguồn

### 🧭 Phần 1: Làm quen & Cú pháp cơ bản

#### 📦 1. `Bai1Hello` *(JRE: JavaSE-21)*
* **Package:** `ntu`
* **Mô tả:** Tiếp cận các khái niệm lập trình đầu tiên, cấu trúc xuất nhập căn bản trên Console.
  * 📄 `HelloWWorld.java` — Xuất dòng chữ chào mừng huyền thoại "Hello World".
  * 📄 `HinhVe.java` — Thao tác xuất ký tự đồ họa để vẽ các hình học cơ bản lên màn hình.
  * 📄 `SayHello.java` — Chương trình tương tác nhận tên người dùng và đưa ra lời chào.
  * 📄 `TinhToan.java` — Triển khai 4 phép tính toán số học căn bản (Cộng, Trừ, Nhân, Chia).

#### 📦 2. `Bai2Variables` *(JRE: jre)*
* **Package:** `(default package)`
* **Mô tả:** Tìm hiểu sâu về hệ thống lưu trữ dữ liệu, bộ nhớ và các phép toán logic.
  * 📄 `Khaibao_Sudung_Bien.java` — Cách khai báo, khởi tạo và quản lý phạm vi sống của biến.
  * 📄 `Operators.java` — Thực hành với các toán tử số học, toán tử logic và toán tử so sánh.
  * 📄 `PrimitiveDataTypes.java` — Khảo sát các kiểu dữ liệu nguyên thủy (`int`, `float`, `double`, `char`...).
  * 📄 `ReferenceTypes.java` — Khai báo và cơ chế quản lý vùng nhớ đối với kiểu dữ liệu tham chiếu.
  * 📄 `TypeCasting.java` — Kỹ thuật ép kiểu dữ liệu tường minh (Narrowing) và tự động (Widening).

---

### 📥 Phần 2: Xử lý Nhập/Xuất & Luồng điều khiển

#### 📦 3. `Bai3.InOutData` *(JRE: JavaSE-20)*
* **Package:** `(default package)`
* **Mô tả:** Làm chủ luồng dữ liệu vào/ra và các kỹ thuật tương tác tệp tin.
  * 📄 `ScannerBasic.java` — Nhận dữ liệu đầu vào cơ bản từ bàn phím bằng lớp `Scanner`.
  * 📄 `BufferedReader_Scanner.java` — Tối ưu hóa hiệu năng nhập dữ liệu giữa hai lớp bổ trợ.
  * 📄 `OutputBasic.java` — Xuất dữ liệu tiêu chuẩn với `print()` và `println()`.
  * 📄 `PrintfDemo.java` — Định dạng chuỗi ký tự hiển thị nâng cao sử dụng `printf()`.
  * 📄 `FileWriter_PrintWriter.java` — Thao tác ghi xuất luồng dữ liệu văn bản ra file hệ thống.
  * 📄 `ExceptionHandling.java` — Bẫy và xử lý ngoại lệ (Try-Catch) ngăn chặn lỗi sập luồng I/O.
  * 📂 *Tệp dữ liệu:* `data.txt`, `output.txt`

#### 📦 4. `Bai4.DK_Renhanh_Java` *(JRE: JavaSE-17)*
* **Package:** `ntu.danhtm2534`
* **Mô tả:** Tư duy cấu trúc rẽ nhánh rập khuôn logic điều hướng luồng chạy của chương trình.
  * 📄 `IfDemo.java` / `IfElseTest.java` — Luồng điều kiện đơn giản và điều kiện loại trừ tương hỗ.
  * 📄 `IfElseIfTest.java` — Cấu trúc kiểm tra đa điều kiện phức tạp nối tiếp nhau.
  * 📄 `SwitchTraditional.java` — Sử dụng cấu trúc rẽ nhánh `switch-case` cổ điển.
  * 📄 `SwitchString.java` — Ứng dụng `switch-case` so khớp trực tiếp dựa trên nhãn chuỗi.
  * 📄 `SwitchArrow.java` — Cập nhật cú pháp `switch` dạng mũi tên (`->`) tinh gọn.
  * 📄 `SwitchYield.java` — Trả dữ liệu trực tiếp từ khối lệnh lựa chọn thông qua từ khóa `yield`.

#### 📦 5. `VongLaptrongJava` *(JRE: JavaSE-17)*
* **Package:** `ntu.danhtm2534`
* **Mô tả:** Làm chủ các cấu trúc lặp chu kỳ để giải quyết các thuật toán tuần hoàn.
  * 📄 `VonglapForcoban.java` / `ForSum.java` — Vòng lặp số lần xác định và thuật toán tính tổng chuỗi số.
  * 📄 `WhileLoop.java` / `WhilePassword.java` — Lặp theo điều kiện trước và ứng dụng kiểm soát tính đúng đắn mật khẩu.
  * 📄 `DoWhileMenu.java` — Thiết kế menu chức năng tương tác vô hạn trên Console bằng `do-while`.
  * 📄 `ForEachArray.java` / `ForEachCollection.java` — Duyệt mảng và cấu trúc dữ liệu Collection tối giản.
  * 📄 `ForEachVar.java` — Áp dụng cơ chế suy luận kiểu biến local (`var`) trong cấu trúc duyệt dữ liệu.

---

### 🏛️ Phần 3: Lập trình hướng đối tượng cơ bản (OOP Basis)

> **Package chung cho toàn bộ phân mục:** `ntu.danhtm2534` | **Môi trường chạy:** `JavaSE-17`

Tìm hiểu và áp dụng tư duy đối tượng, định nghĩa Class, thuộc tính (Attributes) và phương thức (Methods).

| Tên Project | Lớp mô hình đối tượng | Lớp thực thi (Main) | Mô tả bài toán thực tế |
| :--- | :--- | :--- | :--- |
| 📁 **`ViDuOOP_HinhChuNhat`** | `HinhChuNhat.java` | `MainHinhChuNhat.java` | Quản lý các thuộc tính hình học và tính toán Chu vi, Diện tích. |
| 📁 **`viDuOOP_SinhVien`** | `SinhVien.java` | `Main.java` | Mô hình hóa thông tin sinh viên, quản lý điểm và dữ liệu cá nhân. |
| 📁 **`ViDuOOP_XeHoi`** | `XeHoi.java` | `MainXeHoi.java` | Giả lập hành vi của các phương tiện giao thông (khởi động, tăng tốc). |
| 📁 **`OOP_MayTinh`** | `MayTinh.java` | `MainMayTinh.java` | Quản lý thông tin cấu hình phần cứng và giá bán máy tính. |
| 📁 **`OOP_Sach`** | `Sach.java` | `MainSach.java` | Mô hình hóa thuộc tính sách phục vụ cho thư viện hoặc quản lý nhà sách. |
| 📁 **`OOP_TKNganHang`** | `TaiKhoanNganHang.java` | `MainTKNganHang.java` | Kiểm thử tính đóng gói (`Encapsulation`) và các ràng buộc dữ liệu. |
| 📁 **`OOP_Menu_Scanner_BA`** | `TaiKhoanNganHang.java` | `MainBankAccount.java` | Hệ thống ATM mini kết hợp menu `do-while` để Gửi/Rút/Xem số dư. |

---

### 🧬 Phần 4: Tính Kế thừa & Đa hình nâng cao (OOP Advanced)

> **Package chung cho phân mục:** `ntu.danhtm2534` hoặc `ntu.danh2534` | **Môi trường chạy:** `JavaSE-17`

Xây dựng hệ thống phân cấp lớp (Class Hierarchy) phức tạp nhằm tối ưu hóa việc tái sử dụng mã nguồn và triển khai cơ chế đa hình (`Polymorphism`) thông qua ghi đè phương thức (`Method Overriding`).

| Tên Hệ thống / Project | Lớp cha (Superclass) | Các lớp con (Subclasses) | Lớp thực thi (Main) | Mô tả nghiệp vụ thực tế |
| :--- | :--- | :--- | :--- | :--- |
| 📁 **`HethongDongVatCB`** | `DongVat.java` | `ConCho.java`, `ConMeo.java` | `MainDongVat.java` | Mô phỏng đặc trưng hành vi và tiếng kêu riêng biệt của từng loài vật. |
| 📁 **`HeThongNhanVienCty`**| `NhanVien.java` | `NhanVienKinhDoanh.java`, `NhanVienVanPhong.java`, `QuanLy.java` | `MainNhanVien.java` | Quản lý nhân sự, tính lương thưởng tự động theo từng chức vụ phòng ban. |
| 📁 **`HeThongHinhHoc`** | `HinhHoc.java` | `HinhChuNhat.java`, `HinhTamGiac.java`, `HinhTron.java` | `MainHinhHoc.java` | Quản lý hình học diện rộng, đa hình hóa công thức tính chu vi và diện tích. |
| 📁 **`HeThongPTGiaoThong`**| `PhuongTien.java`| `Oto.java`, `XeMay.java` | `MainPhuongTien.java` | Quản lý phương tiện, lưu trữ thông số vận tốc và hãng sản xuất. |
| 📁 **`HeThongTaiKhoanNganHang`**| `TaiKhoan.java` | `TaiKhoanThanhToan.java`, `TaiKhoanTietKiem.java` | `MainTaiKhoan.java` | Nghiệp vụ tài chính: xử lý tính lãi suất tiết kiệm hoặc tính phí giao dịch. |
| 📁 **`HeThongVoHoc`** | `VoHoc.java` | `Judo.java`, `ThaiCucQuyen.java`, `ThieuLamQuyen.java`, `VinhXuanQuyen.java` | `MainVoHoc.java` | Mô hình hóa môn phái võ thuật, quản lý bộ chiêu thức và sát thương. |
| 📁 **`HeThongNhanVatGame`**| `NhanVat.java` | `ChienBinh.java`, `CungThu.java`, `PhapSu.java` | `MainNhanVat.java` | Thiết kế lớp nhân vật RPG, đa hình hóa đòn đánh thường và kỹ năng đặc định. |
| 📁 **`HeThongDaoTaoTrucTuyen`**| `NguoiDung.java` | `GiangVien.java`, `HocVien.java`, `QuanTriVien.java` | `MainNguoiDung.java` | Phân quyền hệ thống E-Learning, quản lý các chức năng đăng nhập, học tập và chấm điểm. |

---

### 📝 Phần 5: Kho Bài tập tổng hợp

#### 📦 `BaiTapThucHanh` & `BaiTapVeNha` *(JRE: JavaSE-17)*
* **Package:** `(default package)`
* **Mô tả:** Các bài tập tổng hợp kết nối kiến thức để giải quyết bài toán nghiệp vụ kinh tế, toán học.
  * 📄 `BaiTap1.java` -> `BaiTap4.java` — Chuỗi bài tập thực hành thuật toán nền tảng trên lớp.
  * 📄 `SumTwoNumbers.java` / `BMICalculator.java` — Chương trình đo chỉ số sức khỏe và tính tổng cơ bản.
  * 📄 `QuyDoiTienTe.java` / `QuydoiTienteUSD_VND.java` — Ứng dụng xử lý tỷ giá chuyển đổi ngoại tệ.
  * 📄 `Phuongtrinhbac1.java` — Thuật toán biện luận và giải phương trình $ax + b = 0$.
  * 📄 `TinhTienLuong.java` — Hệ thống tự động tính lương nhân sự dựa theo ngày công thực tế.
  * 📄 `TinhTienDienBacThang.java` — Tính tiền điện sinh hoạt theo phương pháp lũy tiến từng bậc.
  * 📄 `Nhatky_canhan.java` / `StudentFileManager.java` — Đọc/ghi thông tin nhật ký và hồ sơ học viên.
  * 📂 *Tệp dữ liệu:* `nhatky.txt`, `students.txt`

---

## 🚀 Hướng dẫn Import và Chạy dự án

1. **Tải mã nguồn về máy cục bộ:**
   ```bash
   git clone [https://github.com](https://github.com/danhcnt2508-ops/25TH2534-JavaProgramming)
   ```
2. **Nạp dự án vào IDE:**
   * Mở Eclipse hoặc IntelliJ IDEA chọn **Import** -> **Existing Projects into Workspace**.
   * Trỏ đường dẫn đến thư mục root của kho chứa vừa tải.
3. **Cấu hình lại Build Path (Nếu xảy ra lỗi dấu chấm than vàng):**
   * Chuột phải vào Project bị lỗi $\rightarrow$ Chọn **Build Path** $\rightarrow$ **Configure Build Path**.
   * Tại tab **Libraries**, chỉnh sửa `JRE System Library` đúng với phiên bản được ghi chú phía trên mục lục.
4. **Thực thi ứng dụng:**
   * Tìm đến file chứa hàm `main`, chuột phải chọn **Run As** $\rightarrow$ **Java Application**.
