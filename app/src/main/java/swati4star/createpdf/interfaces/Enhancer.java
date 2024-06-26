package swati4star.createpdf.interfaces;

import androidx.annotation.NonNull;

import swati4star.createpdf.model.EnhancementOptionsEntity;

/**
 * The {@link Enhancer} is a functional interface for all enhancements.
 */
public interface Enhancer {
    /**
     * To apply an enhancement.
     */
    void enhance();

    /**
     * @return The {@link EnhancementOptionsEntity} for this {@link Enhancer}.
     */
    @NonNull
    EnhancementOptionsEntity getEnhancementOptionsEntity();
}
