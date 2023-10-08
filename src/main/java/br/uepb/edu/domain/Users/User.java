package br.uepb.edu.domain.Users;

public class User {
    private String name;
    private int id;
    private String role;
    private String specialPermissions;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.role = builder.role;
        this.specialPermissions = builder.specialPermissions;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", id=" + id + ", role=" + role + ", specialPermissions=" + specialPermissions + "]";
    }

    // UserBuilder dentro da classe User
    public static class UserBuilder {
        private String name;
        private int id;
        private String role;
        private String specialPermissions;

        public UserBuilder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public UserBuilder setRole(String role) {
            this.role = role;
            return this;
        }

        public UserBuilder setSpecialPermissions(String specialPermissions) {
            this.specialPermissions = specialPermissions;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

