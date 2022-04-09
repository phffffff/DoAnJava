-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th4 09, 2022 lúc 11:30 AM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 7.4.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `do_an_java`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ban_an`
--

CREATE TABLE `ban_an` (
  `ma_ban` int(10) UNSIGNED NOT NULL,
  `ban` varchar(25) COLLATE utf8mb4_unicode_ci NOT NULL,
  `trang_thai_ban` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_ct_khuyen_mai`
--

CREATE TABLE `chi_tiet_ct_khuyen_mai` (
  `ma_ctkm` int(10) UNSIGNED NOT NULL,
  `ma_mon` int(10) UNSIGNED NOT NULL,
  `tien_giam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_danh_gia`
--

CREATE TABLE `chi_tiet_danh_gia` (
  `ma_danh_gia` int(10) UNSIGNED NOT NULL,
  `so_sao` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_don_dat`
--

CREATE TABLE `chi_tiet_don_dat` (
  `ma_don_dat` int(10) UNSIGNED NOT NULL,
  `ma_mon` int(10) UNSIGNED NOT NULL,
  `so_luong` int(11) NOT NULL,
  `gia` int(11) NOT NULL,
  `thanh_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chi_tiet_hoa_don`
--

CREATE TABLE `chi_tiet_hoa_don` (
  `ma_hoa_don` int(10) UNSIGNED NOT NULL,
  `ma_mon` int(10) UNSIGNED NOT NULL,
  `so_luong` int(11) NOT NULL,
  `gia_mon` int(10) UNSIGNED NOT NULL,
  `thanh_tien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `chuong_trinh_khuyen_mai`
--

CREATE TABLE `chuong_trinh_khuyen_mai` (
  `ma_ctkm` int(10) UNSIGNED NOT NULL,
  `ten_ctkm` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngay_bat_dau` date NOT NULL,
  `ngay_ket_thuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `danh_gia`
--

CREATE TABLE `danh_gia` (
  `ma_danh_gia` int(10) UNSIGNED NOT NULL,
  `ma_nhan_vien` int(10) UNSIGNED NOT NULL,
  `ma_thanh_vien` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ma_mon` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `don_dat_hang`
--

CREATE TABLE `don_dat_hang` (
  `ma_don_dat` int(10) UNSIGNED NOT NULL,
  `ngay_dat` date NOT NULL,
  `ma_ncc` int(10) UNSIGNED NOT NULL,
  `tong_tien_dat` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hoa_don`
--

CREATE TABLE `hoa_don` (
  `ma_hoa_don` int(10) UNSIGNED NOT NULL,
  `ngay_xuat` date NOT NULL,
  `trang_thai` int(11) NOT NULL DEFAULT 0,
  `ma_nhan_vien` int(10) UNSIGNED NOT NULL,
  `ma_thanh_vien` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ma_ban` int(10) UNSIGNED NOT NULL,
  `tong_tien` int(10) UNSIGNED NOT NULL,
  `tien_giam` int(10) UNSIGNED NOT NULL,
  `tien_con_lai` int(10) UNSIGNED NOT NULL,
  `ma_phieu_giam_gia` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `loai_thuc_an`
--

CREATE TABLE `loai_thuc_an` (
  `ma_loai` int(10) UNSIGNED NOT NULL,
  `ten_loai` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `mon_an`
--

CREATE TABLE `mon_an` (
  `ma_mon` int(10) UNSIGNED NOT NULL,
  `ten_mon` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `loai` int(10) UNSIGNED DEFAULT NULL,
  `so_luong` int(11) NOT NULL,
  `gia` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_vien`
--

CREATE TABLE `nhan_vien` (
  `ma_nhan_vien` int(10) UNSIGNED NOT NULL,
  `ten_nhan_vien` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngay_sinh` date NOT NULL,
  `sdt` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mail` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `tai_khoan` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nha_cung_cap`
--

CREATE TABLE `nha_cung_cap` (
  `ma_ncc` int(10) UNSIGNED NOT NULL,
  `ten_ncc` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `dia_chi` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phan_quyen`
--

CREATE TABLE `phan_quyen` (
  `ma_quyen` int(10) UNSIGNED NOT NULL,
  `quyen` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `phan_quyen`
--

INSERT INTO `phan_quyen` (`ma_quyen`, `quyen`) VALUES
(1, 'admin'),
(2, 'staff');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `phieu_giam_gia`
--

CREATE TABLE `phieu_giam_gia` (
  `ma_phieu_giam_gia` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `giam` int(10) UNSIGNED NOT NULL,
  `ngay_bat_dau` date NOT NULL,
  `ngay_ket_thuc` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tai_khoan`
--

CREATE TABLE `tai_khoan` (
  `ma_tai_khoan` int(10) UNSIGNED NOT NULL,
  `ten_tai_khoan` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_hien_thi` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mat_khau` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '1',
  `phan_quyen` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Đang đổ dữ liệu cho bảng `tai_khoan`
--

INSERT INTO `tai_khoan` (`ma_tai_khoan`, `ten_tai_khoan`, `ten_hien_thi`, `mat_khau`, `phan_quyen`) VALUES
(1, 'kien', 'Huynh Kien', '1', 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `thanh_vien`
--

CREATE TABLE `thanh_vien` (
  `ma_thanh_vien` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ten_thanh_vien` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sdt` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `mail` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diem` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `ban_an`
--
ALTER TABLE `ban_an`
  ADD PRIMARY KEY (`ma_ban`);

--
-- Chỉ mục cho bảng `chi_tiet_ct_khuyen_mai`
--
ALTER TABLE `chi_tiet_ct_khuyen_mai`
  ADD PRIMARY KEY (`ma_ctkm`,`ma_mon`),
  ADD KEY `fk_ctkm_mon` (`ma_mon`);

--
-- Chỉ mục cho bảng `chi_tiet_danh_gia`
--
ALTER TABLE `chi_tiet_danh_gia`
  ADD PRIMARY KEY (`ma_danh_gia`);

--
-- Chỉ mục cho bảng `chi_tiet_don_dat`
--
ALTER TABLE `chi_tiet_don_dat`
  ADD PRIMARY KEY (`ma_don_dat`,`ma_mon`),
  ADD KEY `fk_ctpn_mon` (`ma_mon`);

--
-- Chỉ mục cho bảng `chi_tiet_hoa_don`
--
ALTER TABLE `chi_tiet_hoa_don`
  ADD PRIMARY KEY (`ma_hoa_don`,`ma_mon`),
  ADD KEY `fk_mn_ma` (`ma_mon`);

--
-- Chỉ mục cho bảng `chuong_trinh_khuyen_mai`
--
ALTER TABLE `chuong_trinh_khuyen_mai`
  ADD PRIMARY KEY (`ma_ctkm`);

--
-- Chỉ mục cho bảng `danh_gia`
--
ALTER TABLE `danh_gia`
  ADD PRIMARY KEY (`ma_danh_gia`),
  ADD KEY `fk_dg_nv` (`ma_nhan_vien`),
  ADD KEY `fk_dg_tv` (`ma_thanh_vien`),
  ADD KEY `fk_dg_mon` (`ma_mon`);

--
-- Chỉ mục cho bảng `don_dat_hang`
--
ALTER TABLE `don_dat_hang`
  ADD PRIMARY KEY (`ma_don_dat`),
  ADD KEY `fk_dd_ncc` (`ma_ncc`);

--
-- Chỉ mục cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD PRIMARY KEY (`ma_hoa_don`),
  ADD KEY `fk_hd_ban` (`ma_ban`),
  ADD KEY `fk_hd_nv` (`ma_nhan_vien`),
  ADD KEY `fk_hd_tv` (`ma_thanh_vien`),
  ADD KEY `fk_hd_pg` (`ma_phieu_giam_gia`);

--
-- Chỉ mục cho bảng `loai_thuc_an`
--
ALTER TABLE `loai_thuc_an`
  ADD PRIMARY KEY (`ma_loai`);

--
-- Chỉ mục cho bảng `mon_an`
--
ALTER TABLE `mon_an`
  ADD PRIMARY KEY (`ma_mon`),
  ADD KEY `fk_monan_loai` (`loai`);

--
-- Chỉ mục cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD PRIMARY KEY (`ma_nhan_vien`),
  ADD KEY `fk_nv_tk` (`tai_khoan`);

--
-- Chỉ mục cho bảng `nha_cung_cap`
--
ALTER TABLE `nha_cung_cap`
  ADD PRIMARY KEY (`ma_ncc`);

--
-- Chỉ mục cho bảng `phan_quyen`
--
ALTER TABLE `phan_quyen`
  ADD PRIMARY KEY (`ma_quyen`);

--
-- Chỉ mục cho bảng `phieu_giam_gia`
--
ALTER TABLE `phieu_giam_gia`
  ADD PRIMARY KEY (`ma_phieu_giam_gia`);

--
-- Chỉ mục cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD PRIMARY KEY (`ma_tai_khoan`,`ten_tai_khoan`),
  ADD KEY `fk_tk_pq` (`phan_quyen`);

--
-- Chỉ mục cho bảng `thanh_vien`
--
ALTER TABLE `thanh_vien`
  ADD PRIMARY KEY (`ma_thanh_vien`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `ban_an`
--
ALTER TABLE `ban_an`
  MODIFY `ma_ban` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chi_tiet_danh_gia`
--
ALTER TABLE `chi_tiet_danh_gia`
  MODIFY `ma_danh_gia` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chi_tiet_don_dat`
--
ALTER TABLE `chi_tiet_don_dat`
  MODIFY `ma_don_dat` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `chuong_trinh_khuyen_mai`
--
ALTER TABLE `chuong_trinh_khuyen_mai`
  MODIFY `ma_ctkm` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `danh_gia`
--
ALTER TABLE `danh_gia`
  MODIFY `ma_danh_gia` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `don_dat_hang`
--
ALTER TABLE `don_dat_hang`
  MODIFY `ma_don_dat` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  MODIFY `ma_hoa_don` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `loai_thuc_an`
--
ALTER TABLE `loai_thuc_an`
  MODIFY `ma_loai` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `mon_an`
--
ALTER TABLE `mon_an`
  MODIFY `ma_mon` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  MODIFY `ma_nhan_vien` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `nha_cung_cap`
--
ALTER TABLE `nha_cung_cap`
  MODIFY `ma_ncc` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `phan_quyen`
--
ALTER TABLE `phan_quyen`
  MODIFY `ma_quyen` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  MODIFY `ma_tai_khoan` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chi_tiet_ct_khuyen_mai`
--
ALTER TABLE `chi_tiet_ct_khuyen_mai`
  ADD CONSTRAINT `fk_ctkm_km` FOREIGN KEY (`ma_ctkm`) REFERENCES `chuong_trinh_khuyen_mai` (`ma_ctkm`),
  ADD CONSTRAINT `fk_ctkm_mon` FOREIGN KEY (`ma_mon`) REFERENCES `mon_an` (`ma_mon`);

--
-- Các ràng buộc cho bảng `chi_tiet_danh_gia`
--
ALTER TABLE `chi_tiet_danh_gia`
  ADD CONSTRAINT `fk_ctdg_dg` FOREIGN KEY (`ma_danh_gia`) REFERENCES `danh_gia` (`ma_danh_gia`);

--
-- Các ràng buộc cho bảng `chi_tiet_don_dat`
--
ALTER TABLE `chi_tiet_don_dat`
  ADD CONSTRAINT `fk_ctpn_mon` FOREIGN KEY (`ma_mon`) REFERENCES `mon_an` (`ma_mon`),
  ADD CONSTRAINT `fk_ctpn_pn` FOREIGN KEY (`ma_don_dat`) REFERENCES `don_dat_hang` (`ma_don_dat`);

--
-- Các ràng buộc cho bảng `chi_tiet_hoa_don`
--
ALTER TABLE `chi_tiet_hoa_don`
  ADD CONSTRAINT `fk_mhd_hd` FOREIGN KEY (`ma_hoa_don`) REFERENCES `hoa_don` (`ma_hoa_don`),
  ADD CONSTRAINT `fk_mn_ma` FOREIGN KEY (`ma_mon`) REFERENCES `mon_an` (`ma_mon`);

--
-- Các ràng buộc cho bảng `danh_gia`
--
ALTER TABLE `danh_gia`
  ADD CONSTRAINT `fk_dg_mon` FOREIGN KEY (`ma_mon`) REFERENCES `mon_an` (`ma_mon`),
  ADD CONSTRAINT `fk_dg_nv` FOREIGN KEY (`ma_nhan_vien`) REFERENCES `nhan_vien` (`ma_nhan_vien`),
  ADD CONSTRAINT `fk_dg_tv` FOREIGN KEY (`ma_thanh_vien`) REFERENCES `thanh_vien` (`ma_thanh_vien`);

--
-- Các ràng buộc cho bảng `don_dat_hang`
--
ALTER TABLE `don_dat_hang`
  ADD CONSTRAINT `fk_dd_ncc` FOREIGN KEY (`ma_ncc`) REFERENCES `nha_cung_cap` (`ma_ncc`);

--
-- Các ràng buộc cho bảng `hoa_don`
--
ALTER TABLE `hoa_don`
  ADD CONSTRAINT `fk_hd_ban` FOREIGN KEY (`ma_ban`) REFERENCES `ban_an` (`ma_ban`),
  ADD CONSTRAINT `fk_hd_nv` FOREIGN KEY (`ma_nhan_vien`) REFERENCES `nhan_vien` (`ma_nhan_vien`),
  ADD CONSTRAINT `fk_hd_pg` FOREIGN KEY (`ma_phieu_giam_gia`) REFERENCES `phieu_giam_gia` (`ma_phieu_giam_gia`),
  ADD CONSTRAINT `fk_hd_tv` FOREIGN KEY (`ma_thanh_vien`) REFERENCES `thanh_vien` (`ma_thanh_vien`);

--
-- Các ràng buộc cho bảng `mon_an`
--
ALTER TABLE `mon_an`
  ADD CONSTRAINT `fk_monan_loai` FOREIGN KEY (`loai`) REFERENCES `loai_thuc_an` (`ma_loai`);

--
-- Các ràng buộc cho bảng `nhan_vien`
--
ALTER TABLE `nhan_vien`
  ADD CONSTRAINT `fk_nv_tk` FOREIGN KEY (`tai_khoan`) REFERENCES `tai_khoan` (`ma_tai_khoan`);

--
-- Các ràng buộc cho bảng `tai_khoan`
--
ALTER TABLE `tai_khoan`
  ADD CONSTRAINT `fk_tk_pq` FOREIGN KEY (`phan_quyen`) REFERENCES `phan_quyen` (`ma_quyen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
