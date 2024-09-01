package edu.iuh.fit;

/**
 * Description: Lớp này đại diện cho thông tin của course
 * @author: Phuc, Le Hong Phuc
 * @version: 1.0
 * @created : 01/09/2024
 */

public class Course {
    private String id;
    private String title;
    private int credit;
    private String department;

    /**
     * Mô tả: Constructor mặc định
     */
    public Course() {
    }

    /**
     * Mô tả: Constructor với các tham số
     *
     * @param id Mã số của course
     * @param title Tên của course
     * @param credit Số tín chỉ của course
     * @param department Khoa của course
     * @throws IllegalArgumentException nếu bất kỳ tham số nào không hợp lệ
     */
    public Course(String id, String title, int credit, String department) {
        setId(id);
        setTitle(title);
        setCredit(credit);
        setDepartment(department);
    }

    /**
     * Mô tả: Lấy mã số của course
     *
     * @return Mã số của course
     */
    public String getId() {
        return id;
    }

    /**
     * Mô tả: Đặt mã số của course
     *
     * @param id Mã số của course
     * @throws IllegalArgumentException nếu id null, độ dài id nhỏ hơn 3, hoặc id chứa ký tự không phải chữ cái hoặc chữ số
     */
    public void setId(String id) {
        if (id == null || id.length() < 3)
            throw new IllegalArgumentException("ID phải có ít nhất 3 ký tự");
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isLetterOrDigit(id.charAt(i)))
                throw new IllegalArgumentException("ID chỉ được chứa chữ cái hoặc chữ số");
        }
        this.id = id;
    }

    /**
     * Mô tả: Lấy tên của course
     *
     * @return Tên của course
     */
    public String getTitle() {
        return title;
    }

    /**
     * Mô tả: Đặt tên của course
     *
     * @param title Tên của course
     * @throws IllegalArgumentException nếu title null hoặc rỗng
     */
    public void setTitle(String title) {
        if (title == null || title.isEmpty())
            throw new IllegalArgumentException("Tên course không được để trống");
        this.title = title;
    }

    /**
     * Mô tả: Lấy số tín chỉ của course
     *
     * @return Số tín chỉ của course
     */
    public int getCredit() {
        return credit;
    }

    /**
     * Mô tả: Đặt số tín chỉ của course
     *
     * @param credit Số tín chỉ của course
     * @throws IllegalArgumentException nếu credit nhỏ hơn 0
     */
    public void setCredit(int credit) {
        if (credit < 0)
            throw new IllegalArgumentException("Số tín chỉ phải lớn hơn hoặc bằng 0");
        this.credit = credit;
    }

    /**
     * Mô tả: Lấy khoa của course
     *
     * @return Khoa của course
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Mô tả: Đặt khoa của course
     *
     * @param department Khoa của course
     * @throws IllegalArgumentException nếu department null hoặc rỗng
     */
    public void setDepartment(String department) {
        if (department == null || department.isEmpty())
            throw new IllegalArgumentException("Khoa không được để trống");
        this.department = department;
    }

    /**
     * Mô tả: Trả về chuỗi đại diện cho thông tin course
     *
     * @return Chuỗi định dạng chứa thông tin course
     */
    @Override
    public String toString() {
        return String.format("%-10s%-30s%2d  %-10s", id, title, credit, department);
    }
}
