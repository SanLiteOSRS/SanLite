import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("ea")
	@ObfuscatedGetter(
		intValue = 1760304111
	)
	static int field552;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "Lco;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 1649848391
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("l")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("m")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Liw;I)V",
		garbageValue = "181624025"
	)
	public static void method1224(AbstractArchive var0) {
		FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0;
	}

	@ObfuscatedName("l")
	public static int method1228(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		signature = "(II)Z",
		garbageValue = "-1190180925"
	)
	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (Widget.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Decimator.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Decimator.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Decimator.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == -1) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				Widget.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-398927315"
	)
	@Export("runWidgetOnLoadListener")
	static void runWidgetOnLoadListener(int var0) {
		if (var0 != -1) {
			if (loadInterface(var0)) {
				Widget[] var1 = Widget.Widget_interfaceComponents[var0];

				for (int var2 = 0; var2 < var1.length; ++var2) {
					Widget var3 = var1[var2];
					if (var3.onLoad != null) {
						ScriptEvent var4 = new ScriptEvent();
						var4.widget = var3;
						var4.args = var3.onLoad;
						class58.runScript(var4, 5000000);
					}
				}

			}
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;I)V",
		garbageValue = "-3110189"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (DevicePcmPlayerProvider.clanChat != null) {
			PacketBufferNode var1 = class4.getPacketBufferNode(ClientPacket.field2333, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(SpriteMask.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
