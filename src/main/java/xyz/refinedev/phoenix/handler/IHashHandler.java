package xyz.refinedev.phoenix.handler;

public interface IHashHandler {
    /**
     * Hash a string with SHA-256
     *
     * @param input {@link String} Input
     * @return {@link String} Hashed String
     */
    public String hash(String input);
}
