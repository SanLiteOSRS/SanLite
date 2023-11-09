import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("n")
public class class14 {
	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	static AbstractSocket field83;
	@ObfuscatedName("kn")
	@ObfuscatedGetter(
		intValue = -866172123
	)
	@Export("oculusOrbFocalPointY")
	static int oculusOrbFocalPointY;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -1464480991
	)
	final int field81;
	@ObfuscatedName("e")
	final String field85;
	@ObfuscatedName("v")
	final ThreadFactory field82;
	@ObfuscatedName("x")
	final ThreadPoolExecutor field86;

	public class14(String var1, int var2, int var3) {
		this.field85 = var1; // L: 15
		this.field81 = var2; // L: 16
		this.field82 = new class16(this); // L: 17
		this.field86 = this.method166(var3); // L: 18
	} // L: 19

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/util/concurrent/ThreadPoolExecutor;",
		garbageValue = "496995616"
	)
	final ThreadPoolExecutor method166(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field81), this.field82); // L: 22
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lj;B)Lt;",
		garbageValue = "-99"
	)
	public class19 method167(class10 var1) {
		if (this.field86.getQueue().remainingCapacity() <= 0) { // L: 26
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field86.getCorePoolSize() + " Queue capacity " + this.field81); // L: 27
			return new class19("Queue full"); // L: 28
		} else {
			class19 var2 = new class19(this.field86.submit(new class20(this, var1))); // L: 30
			return var2; // L: 31
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1559640620"
	)
	public final void method171() {
		try {
			this.field86.shutdown(); // L: 36
		} catch (Exception var2) { // L: 38
			System.err.println("Error shutting down RestRequestService\r\n" + var2); // L: 39
		}

	} // L: 41

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lgw;I)V",
		garbageValue = "2031044103"
	)
	static final void method168(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) { // L: 94
			for (var7 = 0; var7 < 64; ++var7) { // L: 95
				for (var8 = 0; var8 < 64; ++var8) { // L: 96
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) { // L: 97
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0); // L: 101

		for (var7 = 0; var7 < 4; ++var7) { // L: 102
			for (var8 = 0; var8 < 64; ++var8) { // L: 103
				for (int var9 = 0; var9 < 64; ++var9) { // L: 104
					int var10 = var8 + var1; // L: 105
					int var11 = var9 + var2; // L: 106
					Messages.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0); // L: 107
				}
			}
		}

	} // L: 111

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "39"
	)
	static int method172(int var0, Script var1, boolean var2) {
		Widget var3 = class175.getWidget(Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize]); // L: 1603
		if (var0 == ScriptOpcodes.IF_GETX) { // L: 1604
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.x; // L: 1605
			return 1; // L: 1606
		} else if (var0 == ScriptOpcodes.IF_GETY) { // L: 1608
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.y; // L: 1609
			return 1; // L: 1610
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) { // L: 1612
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.width; // L: 1613
			return 1; // L: 1614
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) { // L: 1616
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.height; // L: 1617
			return 1; // L: 1618
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) { // L: 1620
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0; // L: 1621
			return 1; // L: 1622
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) { // L: 1624
			Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.parentId; // L: 1625
			return 1; // L: 1626
		} else {
			return 2; // L: 1628
		}
	}

	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1631694430"
	)
	static final void method170(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 12154
		var0 = 100 - var0; // L: 12155
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 12156
		FileSystem.method3480((double)var1); // L: 12157
	} // L: 12158
}
