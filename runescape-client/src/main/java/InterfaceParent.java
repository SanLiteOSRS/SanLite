import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_spriteWidths")
	public static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ag")
	@Export("ByteArrayPool_arrays")
	public static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1221428619
	)
	@Export("group")
	int group;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1118344763
	)
	@Export("type")
	int type;
	@ObfuscatedName("ac")
	boolean field1042;

	InterfaceParent() {
		this.field1042 = false; // L: 8
	} // L: 10

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhb;",
		garbageValue = "1635329248"
	)
	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0); // L: 23
			var1 = new InvDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, (long)var0); // L: 26
			return var1; // L: 27
		}
	}

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "102"
	)
	static void method2257() {
		int var0 = Players.Players_count; // L: 4801
		int[] var1 = Players.Players_indices; // L: 4802

		for (int var2 = 0; var2 < var0; ++var2) { // L: 4803
			if (var1[var2] != Client.combatTargetPlayerIndex && var1[var2] != Client.localPlayerIndex) { // L: 4804
				class220.addPlayerToScene(Client.players[var1[var2]], true); // L: 4805
			}
		}

	} // L: 4807

	@ObfuscatedName("lk")
	@ObfuscatedSignature(
		descriptor = "(Lmy;IIIIIII)V",
		garbageValue = "-1926672462"
	)
	static final void method2255(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field560) { // L: 10610
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0; // L: 10611
		}

		Client.field560 = false; // L: 10612
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !class319.mouseCam && MouseHandler.MouseHandler_currentButton == 4) { // L: 10613
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) { // L: 10614
				var0.scrollY -= 4; // L: 10615
				class69.invalidateWidget(var0); // L: 10616
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) { // L: 10618
				var0.scrollY += 4; // L: 10619
				class69.invalidateWidget(var0); // L: 10620
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) { // L: 10622
				var7 = var3 * (var3 - 32) / var4; // L: 10623
				if (var7 < 8) { // L: 10624
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2; // L: 10625
				int var9 = var3 - 32 - var7; // L: 10626
				var0.scrollY = var8 * (var4 - var3) / var9; // L: 10627
				class69.invalidateWidget(var0); // L: 10628
				Client.field560 = true; // L: 10629
			}
		}

		if (Client.mouseWheelRotation != 0) { // L: 10632
			var7 = var0.width; // L: 10633
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) { // L: 10634
				var0.scrollY += Client.mouseWheelRotation * 45; // L: 10635
				class69.invalidateWidget(var0); // L: 10636
			}
		}

	} // L: 10639
}
