import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("IgnoreList")
public class IgnoreList extends NameableContainer {
	@ObfuscatedName("av")
	public static int[] field4609;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	final LoginType field4606;

	@ObfuscatedSignature(
		descriptor = "(Lsl;)V"
	)
	public IgnoreList(LoginType var1) {
		super(400); // L: 16
		this.field4606 = var1; // L: 17
	} // L: 18

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lqh;",
		garbageValue = "-76"
	)
	@Export("newInstance")
	Nameable newInstance() {
		return new Ignored(); // L: 22
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lqh;",
		garbageValue = "24"
	)
	@Export("newTypedArray")
	Nameable[] newTypedArray(int var1) {
		return new Ignored[var1]; // L: 27
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltl;IS)V",
		garbageValue = "4295"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		while (var1.offset < var2) { // L: 31
			int var3 = var1.readUnsignedByte(); // L: 32
			if (var3 == 4) { // L: 33
				Username var10 = new Username(var1.readStringCp1252NullTerminated(), this.field4606); // L: 34
				if (!var10.hasCleanName()) {
					throw new IllegalStateException(); // L: 35
				}

				boolean var11 = false; // L: 36
				class162.friendSystem.method1880(var10.getName(), var11); // L: 37
			} else {
				boolean var4 = (var3 & 1) != 0; // L: 40
				Username var5 = new Username(var1.readStringCp1252NullTerminated(), this.field4606); // L: 41
				Username var6 = new Username(var1.readStringCp1252NullTerminated(), this.field4606); // L: 42
				var1.readStringCp1252NullTerminated(); // L: 43
				if (!var5.hasCleanName()) { // L: 44
					throw new IllegalStateException();
				}

				Ignored var7 = (Ignored)this.getByCurrentUsername(var5); // L: 45
				if (var4) { // L: 46
					Ignored var8 = (Ignored)this.getByCurrentUsername(var6); // L: 47
					if (var8 != null && var8 != var7) { // L: 48
						if (var7 != null) { // L: 49
							this.remove(var8); // L: 50
						} else {
							var7 = var8; // L: 53
						}
					}
				}

				if (var7 != null) { // L: 57
					this.changeName(var7, var5, var6); // L: 58
				} else if (this.getSize() < 400) { // L: 60
					int var9 = this.getSize(); // L: 61
					var7 = (Ignored)this.addLast(var5, var6); // L: 62
					var7.id = var9; // L: 63
				}
			}
		}

	} // L: 67

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-15"
	)
	@Export("doCheat")
	static final void doCheat(String var0) {
		if (var0.equalsIgnoreCase("toggleroof")) { // L: 3975
			ScriptFrame.clientPreferences.method2502(!ScriptFrame.clientPreferences.method2543()); // L: 3976
			if (ScriptFrame.clientPreferences.method2543()) { // L: 3977
				ReflectionCheck.addGameMessage(99, "", "Roofs are now all hidden"); // L: 3978
			} else {
				ReflectionCheck.addGameMessage(99, "", "Roofs will only be removed selectively"); // L: 3981
			}
		}

		if (var0.startsWith("zbuf")) { // L: 3984
			boolean var1 = class317.method6078(var0.substring(5).trim()) == 1; // L: 3985
			class415.client.method521(var1); // L: 3986
			Rasterizer3D.method4476(var1); // L: 3987
		}

		if (var0.equalsIgnoreCase("z")) { // L: 3989
			Client.renderSelf = !Client.renderSelf;
		}

		if (var0.equalsIgnoreCase("displayfps")) { // L: 3990
			ScriptFrame.clientPreferences.method2533();
		}

		if (var0.equalsIgnoreCase("renderself")) { // L: 3991
			Client.field626 = !Client.field626;
		}

		if (var0.equalsIgnoreCase("mouseovertext")) { // L: 3992
			Client.showMouseOverText = !Client.showMouseOverText;
		}

		if (Client.staffModLevel >= 2) { // L: 3993
			if (var0.equalsIgnoreCase("errortest")) { // L: 3994
				throw new RuntimeException();
			}

			if (var0.equalsIgnoreCase("showcoord")) {
				ScriptFrame.worldMap.showCoord = !ScriptFrame.worldMap.showCoord; // L: 3995
			}

			if (var0.equalsIgnoreCase("fpson")) { // L: 3996
				ScriptFrame.clientPreferences.method2508(true);
			}

			if (var0.equalsIgnoreCase("fpsoff")) { // L: 3997
				ScriptFrame.clientPreferences.method2508(false);
			}

			if (var0.equalsIgnoreCase("gc")) { // L: 3998
				System.gc();
			}

			if (var0.equalsIgnoreCase("clientdrop")) { // L: 3999
				VerticalAlignment.method3884();
			}
		}

		PacketBufferNode var2 = class217.getPacketBufferNode(ClientPacket.field3128, Client.packetWriter.isaacCipher); // L: 4002
		var2.packetBuffer.writeByte(var0.length() + 1); // L: 4003
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 4004
		Client.packetWriter.addNode(var2); // L: 4005
	} // L: 4006
}
