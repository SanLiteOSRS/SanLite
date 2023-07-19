import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public class class16 implements ThreadFactory {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lca;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ai")
	final ThreadGroup field78;
	@ObfuscatedName("aj")
	final AtomicInteger field75;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lag;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field75 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field78 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field78, var1, this.this$0.field70 + "-rest-request-" + this.field75.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "82"
	)
	static final void method232() {
		int[] var0 = Players.Players_indices; // L: 3956

		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) { // L: 3957
			Player var4 = Client.players[var0[var1]]; // L: 3958
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) { // L: 3959
				--var4.overheadTextCyclesRemaining; // L: 3960
				if (var4.overheadTextCyclesRemaining == 0) { // L: 3961
					var4.overheadText = null;
				}
			}
		}

		for (var1 = 0; var1 < Client.npcCount; ++var1) { // L: 3964
			int var2 = Client.npcIndices[var1]; // L: 3965
			NPC var3 = Client.npcs[var2]; // L: 3966
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) { // L: 3967
				--var3.overheadTextCyclesRemaining; // L: 3968
				if (var3.overheadTextCyclesRemaining == 0) { // L: 3969
					var3.overheadText = null;
				}
			}
		}

	} // L: 3972

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1266383705"
	)
	static final void method234() {
		int var0 = class36.menuX; // L: 9124
		int var1 = WorldMapElement.menuY; // L: 9125
		int var2 = class148.menuWidth; // L: 9126
		int var3 = RouteStrategy.menuHeight; // L: 9127
		int var4 = 6116423; // L: 9128
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, var4); // L: 9129
		Rasterizer2D.Rasterizer2D_fillRectangle(var0 + 1, var1 + 1, var2 - 2, 16, 0); // L: 9130
		Rasterizer2D.Rasterizer2D_drawRectangle(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0); // L: 9131
		class290.fontBold12.draw("Choose Option", var0 + 3, var1 + 14, var4, -1); // L: 9132
		int var5 = MouseHandler.MouseHandler_x; // L: 9133
		int var6 = MouseHandler.MouseHandler_y; // L: 9134

		for (int var7 = 0; var7 < Client.menuOptionsCount; ++var7) { // L: 9135
			int var8 = var1 + (Client.menuOptionsCount - 1 - var7) * 15 + 31; // L: 9136
			int var9 = 16777215; // L: 9137
			if (var5 > var0 && var5 < var2 + var0 && var6 > var8 - 13 && var6 < var8 + 3) { // L: 9138
				var9 = 16776960;
			}

			Font var10 = class290.fontBold12; // L: 9139
			String var11;
			if (var7 < 0) { // L: 9142
				var11 = ""; // L: 9143
			} else if (Client.menuTargets[var7].length() > 0) { // L: 9146
				var11 = Client.menuActions[var7] + " " + Client.menuTargets[var7];
			} else {
				var11 = Client.menuActions[var7]; // L: 9147
			}

			var10.draw(var11, var0 + 3, var8, var9, 0); // L: 9149
		}

		class47.method889(class36.menuX, WorldMapElement.menuY, class148.menuWidth, RouteStrategy.menuHeight); // L: 9151
	} // L: 9152

	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2077345510"
	)
	static final void method235(int var0) {
		if (var0 >= 0) { // L: 9293
			int var1 = Client.menuArguments1[var0]; // L: 9294
			int var2 = Client.menuArguments2[var0]; // L: 9295
			int var3 = Client.menuOpcodes[var0]; // L: 9296
			int var4 = Client.menuIdentifiers[var0]; // L: 9297
			int var5 = Client.field663[var0]; // L: 9298
			String var6 = Client.menuActions[var0]; // L: 9299
			String var7 = Client.menuTargets[var0]; // L: 9300
			class157.method3364(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9301
		}
	} // L: 9302
}
