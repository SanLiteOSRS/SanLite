import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bd")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
	@ObfuscatedName("tj")
	@ObfuscatedGetter(
		intValue = -1879997491
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;

	ApproximateRouteStrategy() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIILfl;B)Z",
		garbageValue = "11"
	)
	@Export("hasArrived")
	public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
		return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2082645900"
	)
	public static boolean method1269() {
		return class233.musicPlayerStatus != 0 ? true : class233.midiPcmStream.isReady();
	}

	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1872242824"
	)
	static final void method1268() {
		if (Client.logoutTimer > 0) {
			PcmPlayer.logOut();
		} else {
			Client.timer.method5672();
			Projectile.updateGameState(40);
			DefaultsGroup.field3887 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
