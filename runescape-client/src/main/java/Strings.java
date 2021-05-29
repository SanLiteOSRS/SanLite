import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bu")
	public static String field3306;
	@ObfuscatedName("cu")
	public static String field3327;
	@ObfuscatedName("jy")
	public static String field3503;
	@ObfuscatedName("jg")
	public static String field3504;
	@ObfuscatedName("jp")
	public static String field3505;

	static {
		field3306 = "Please visit the support page for assistance.";
		field3327 = "Please visit the support page for assistance.";
		field3503 = "";
		field3504 = "Page has opened in a new window.";
		field3505 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("gw")
	@ObfuscatedSignature(
		descriptor = "(Lcy;I)V",
		garbageValue = "-1661416870"
	)
	static final void method4850(Actor var0) {
		if (var0.field1289 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) {
					int var2 = var0.x - ((Actor)var1).x;
					int var3 = var0.y - ((Actor)var1).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1264 != -1 && (var0.pathLength == 0 || var0.field1294 > 0)) {
				var0.orientation = var0.field1264;
				var0.field1264 = -1;
			}

			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1282;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= var0.field1289;
					var6 = true;
					if (var4 < var0.field1289 || var4 > 2048 - var0.field1289) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.idleSequence == var0.movementSequence && (var0.field1282 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1289;
					var6 = true;
					if (var4 < var0.field1289 || var4 > 2048 - var0.field1289) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1282 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1282 = 0;
			}

		}
	}
}
