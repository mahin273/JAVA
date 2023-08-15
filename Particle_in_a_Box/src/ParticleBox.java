import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
public class ParticleBox {
    private int boxId;
    private Particle[] particles;
    private int arrayIndex;
    public ParticleBox(int numOfParticles) {
        boxId = 0; // Initialize boxId (you can set it to any desired value)
        particles = new Particle[numOfParticles];
        arrayIndex = 0;
    }
    public void addParticle(Particle particle) {
        if (arrayIndex < particles.length) {
            particles[arrayIndex] = particle;
            arrayIndex++;
        } else {
            System.out.println("ParticleBox is full. Cannot add more particles.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticleBox that = (ParticleBox) o;
        return boxId == that.boxId && arrayIndex == that.arrayIndex && Arrays.equals(particles, that.particles);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(boxId, arrayIndex);
        result = 31 * result + Arrays.hashCode(particles);
        return result;
    }

    public double getChargeVar() {
        double sum = 0.0;
        for (int i = 0; i < arrayIndex; i++) {
            sum += particles[i].getCharge();
        }
        double mean = sum / arrayIndex;
        double varianceSum = 0.0;
        for (int i = 0; i < arrayIndex; i++) {
            double diff = particles[i].getCharge() - mean;
            varianceSum += (diff * diff);
        }
        double variance = varianceSum / (arrayIndex - 1);
        return variance;
    }

}