import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("MouseRecorder")
public class MouseRecorder implements Runnable {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("tk")
	@ObfuscatedSignature(
		descriptor = "Lbi;"
	)
	@Export("pcmPlayer0")
	static PcmPlayer pcmPlayer0;
	@ObfuscatedName("at")
	@Export("isRunning")
	boolean isRunning;
	@ObfuscatedName("an")
	@Export("lock")
	Object lock;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -413684111
	)
	@Export("index")
	int index;
	@ObfuscatedName("as")
	@Export("xs")
	int[] xs;
	@ObfuscatedName("ax")
	@Export("ys")
	int[] ys;
	@ObfuscatedName("ap")
	@Export("millis")
	long[] millis;

	MouseRecorder() {
		this.isRunning = true; // L: 7
		this.lock = new Object(); // L: 8
		this.index = 0; // L: 9
		this.xs = new int[500]; // L: 10
		this.ys = new int[500]; // L: 11
		this.millis = new long[500]; // L: 12
	} // L: 14

	public void run() {
		for (; this.isRunning; GroundObject.method4357(50L)) { // L: 18 27
			synchronized(this.lock) { // L: 19
				if (this.index < 500) { // L: 20
					this.xs[this.index] = MouseHandler.MouseHandler_x; // L: 21
					this.ys[this.index] = MouseHandler.MouseHandler_y; // L: 22
					this.millis[this.index] = MouseHandler.MouseHandler_millis; // L: 23
					++this.index; // L: 24
				}
			}
		}

	} // L: 29

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1925901423"
	)
	static void method2260() {
		Players.Players_count = 0; // L: 686

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 687
			Players.field1332[var0] = null; // L: 688
			Players.field1328[var0] = class216.field2395; // L: 689
		}

	} // L: 691

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-22181255"
	)
	static final void method2261() {
		boolean var0 = false; // L: 10120

		while (!var0) { // L: 10121
			var0 = true; // L: 10122

			for (int var1 = 0; var1 < Client.menuOptionsCount - 1; ++var1) { // L: 10123
				if (Client.menuOpcodes[var1] < 1000 && Client.menuOpcodes[var1 + 1] > 1000) { // L: 10124
					String var2 = Client.menuTargets[var1]; // L: 10125
					Client.menuTargets[var1] = Client.menuTargets[var1 + 1]; // L: 10126
					Client.menuTargets[var1 + 1] = var2; // L: 10127
					String var3 = Client.menuActions[var1]; // L: 10128
					Client.menuActions[var1] = Client.menuActions[var1 + 1]; // L: 10129
					Client.menuActions[var1 + 1] = var3; // L: 10130
					int var4 = Client.menuOpcodes[var1]; // L: 10131
					Client.menuOpcodes[var1] = Client.menuOpcodes[var1 + 1]; // L: 10132
					Client.menuOpcodes[var1 + 1] = var4; // L: 10133
					var4 = Client.menuArguments1[var1]; // L: 10134
					Client.menuArguments1[var1] = Client.menuArguments1[var1 + 1]; // L: 10135
					Client.menuArguments1[var1 + 1] = var4; // L: 10136
					var4 = Client.menuArguments2[var1]; // L: 10137
					Client.menuArguments2[var1] = Client.menuArguments2[var1 + 1]; // L: 10138
					Client.menuArguments2[var1 + 1] = var4; // L: 10139
					var4 = Client.menuIdentifiers[var1]; // L: 10140
					Client.menuIdentifiers[var1] = Client.menuIdentifiers[var1 + 1]; // L: 10141
					Client.menuIdentifiers[var1 + 1] = var4; // L: 10142
					var4 = Client.field655[var1]; // L: 10143
					Client.field655[var1] = Client.field655[var1 + 1]; // L: 10144
					Client.field655[var1 + 1] = var4; // L: 10145
					boolean var5 = Client.menuShiftClick[var1]; // L: 10146
					Client.menuShiftClick[var1] = Client.menuShiftClick[var1 + 1]; // L: 10147
					Client.menuShiftClick[var1 + 1] = var5; // L: 10148
					var0 = false; // L: 10149
				}
			}
		}

	} // L: 10153
}
