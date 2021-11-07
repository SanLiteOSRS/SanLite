import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("Clock")
public abstract class Clock {
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	@Export("clock")
	protected static Clock clock;

	Clock() {
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1421350581"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1121035205"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	static final void method2960() {
		if (Client.logoutTimer > 0) {
			SequenceDefinition.logOut();
		} else {
			Client.timer.method5978();
			WorldMapData_1.updateGameState(40);
			Projectile.field915 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
