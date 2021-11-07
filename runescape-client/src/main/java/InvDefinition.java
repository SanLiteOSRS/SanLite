import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ei")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("dv")
	@ObfuscatedSignature(
		descriptor = "Lkd;"
	)
	@Export("archive0")
	static Archive archive0;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1330627969
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "2084245360"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lop;II)V",
		garbageValue = "712504177"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfu;",
		garbageValue = "26"
	)
	public static FloorOverlayDefinition method2987(int var0) {
		FloorOverlayDefinition var1 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var1 = new FloorOverlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbp;",
		garbageValue = "92"
	)
	@Export("getScript")
	static Script getScript(int var0) {
		Script var1 = (Script)Script.Script_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class14.archive12.takeFile(var0, 0);
			if (var2 == null) {
				return null;
			} else {
				var1 = class87.newScript(var2);
				Script.Script_cached.put(var1, (long)var0);
				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1968764473"
	)
	static void method2983() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1702498175"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field3881) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field3882) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field3883) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field3891 < ByteArrayPool.field3884) {
			ByteArrayPool.field3888[++ByteArrayPool.field3891 - 1] = var0;
		} else {
			if (class260.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < class176.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == class176.ByteArrayPool_alternativeSizes[var1] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1] < class260.ByteArrayPool_arrays[var1].length) {
						class260.ByteArrayPool_arrays[var1][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(ILbp;ZI)I",
		garbageValue = "-1900021864"
	)
	static int method2982(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class14.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class14.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class14.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}

			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class14.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-2065208815"
	)
	public static void method2986(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2736, Client.packetWriter.isaacCipher);
		var4.packetBuffer.method6962(var0);
		var4.packetBuffer.method6962(var1);
		var4.packetBuffer.method6993(var2);
		var4.packetBuffer.writeIntME(var3 ? Client.field552 : 0);
		Client.packetWriter.addNode(var4);
	}
}
