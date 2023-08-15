import java.util.*;
public  class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of particles: ");
        int numOfParticles = scanner.nextInt();

        ParticleBox particleBox = new ParticleBox(numOfParticles);

        for (int i = 0; i < numOfParticles; i++) {
        System.out.print("Enter the charge value for particle " + (i + 1) + ": ");
        double charge = scanner.nextDouble();
        Particle particle = new Particle(charge);
        particleBox.addParticle(particle);
        }

        double chargeVariance = particleBox.getChargeVar();
        System.out.println("Charge Variance: " + chargeVariance);

        scanner.close();
        }
        }
