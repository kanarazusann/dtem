package com.example.dtem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "\"chat_message\"")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"id\"")
    private Long id;
    
    @Column(name = "\"sender_id\"", nullable = false)
    private String senderId;
    
    @Column(name = "\"receiver_id\"", nullable = false)
    private String receiverId;
    
    @Column(name = "\"room_id\"", nullable = false)
    private String roomId;
    
    @Column(name = "\"content\"", nullable = false, length = 2000)
    private String content;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "\"type\"")
    private MessageType type;
    
    @Column(name = "\"timestamp\"", nullable = false)
    private LocalDateTime timestamp;
    
    @Column(name = "\"is_read\"", nullable = false)
    private boolean isRead = false;
    
    public enum MessageType {
        CHAT, JOIN, LEAVE, TYPING
    }
}


