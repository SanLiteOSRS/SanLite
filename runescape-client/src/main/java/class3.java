import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("g")
public class class3 extends Node {
	@ObfuscatedName("rz")
	@ObfuscatedSignature(
		descriptor = "Lbg;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("h")
	boolean field33;
	@ObfuscatedName("c")
	boolean field30;
	@ObfuscatedName("o")
	public List field32;
	@ObfuscatedName("g")
	int[] field35;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		longValue = 2216912450870732033L
	)
	long field34;
	@ObfuscatedName("z")
	public String field38;
	@ObfuscatedName("t")
	public byte field36;
	@ObfuscatedName("v")
	public byte field37;

	static {
		new BitSet(65536);
	}

	@ObfuscatedSignature(
		descriptor = "(Lnk;)V"
	)
	public class3(Buffer var1) {
		this.field30 = true;
		this.field38 = null;
		this.method35(var1);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1568890582"
	)
	public int[] method31() {
		if (this.field35 == null) {
			String[] var1 = new String[this.field32.size()];
			this.field35 = new int[this.field32.size()];

			for (int var2 = 0; var2 < this.field32.size(); this.field35[var2] = var2++) {
				var1[var2] = ((class9)this.field32.get(var2)).field73;
			}

			int[] var3 = this.field35;
			class124.method2500(var1, var3, 0, var1.length - 1);
		}

		return this.field35;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lq;I)V",
		garbageValue = "390115947"
	)
	void method29(class9 var1) {
		this.field32.add(var1);
		this.field35 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-237070101"
	)
	void method33(int var1) {
		this.field32.remove(var1);
		this.field35 = null;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "29"
	)
	public int method39() {
		return this.field32.size();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1935800799"
	)
	public int method34(String var1) {
		if (!this.field30) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.field32.size(); ++var2) {
				if (((class9)this.field32.get(var2)).field73.equalsIgnoreCase(var1)) {
					return var2;
				}
			}

			return -1;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lnk;B)V",
		garbageValue = "-13"
	)
	void method35(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if ((var2 & 1) != 0) {
			this.field33 = true;
		}

		if ((var2 & 2) != 0) {
			this.field30 = true;
		}

		int var3 = 2;
		if ((var2 & 4) != 0) {
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong();
		this.field34 = var1.readLong();
		this.field38 = var1.readStringCp1252NullTerminated();
		var1.readBoolean();
		this.field37 = var1.readByte();
		this.field36 = var1.readByte();
		int var4 = var1.readUnsignedShort();
		if (var4 > 0) {
			this.field32 = new ArrayList(var4);

			for (int var5 = 0; var5 < var4; ++var5) {
				class9 var6 = new class9();
				if (this.field33) {
					var1.readLong();
				}

				if (this.field30) {
					var6.field73 = var1.readStringCp1252NullTerminated();
				}

				var6.field76 = var1.readByte();
				var6.field80 = var1.readUnsignedShort();
				if (var3 >= 3) {
					var1.readBoolean();
				}

				this.field32.add(var5, var6);
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-106"
	)
	static boolean method47(int var0, int var1) {
		return var0 != 4 || var1 < 8;
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(ZLnm;B)V",
		garbageValue = "6"
	)
	@Export("updateNpcs")
	static final void updateNpcs(boolean var0, PacketBuffer var1) {
		Client.field737 = 0;
		Client.field661 = 0;
		UserComparator9.method2477();

		int var2;
		while (var1.bitsRemaining(Client.packetWriter.serverPacketLength) >= 27) {
			var2 = var1.readBits(15);
			if (var2 == 32767) {
				break;
			}

			boolean var3 = false;
			if (Client.npcs[var2] == null) {
				Client.npcs[var2] = new NPC();
				var3 = true;
			}

			NPC var4 = Client.npcs[var2];
			Client.npcIndices[++Client.npcCount - 1] = var2;
			var4.npcCycle = Client.cycle;
			var4.definition = class8.getNpcDefinition(var1.readBits(14));
			int var7;
			if (var0) {
				var7 = var1.readBits(8);
				if (var7 > 127) {
					var7 -= 256;
				}
			} else {
				var7 = var1.readBits(5);
				if (var7 > 15) {
					var7 -= 32;
				}
			}

			int var6;
			if (var0) {
				var6 = var1.readBits(8);
				if (var6 > 127) {
					var6 -= 256;
				}
			} else {
				var6 = var1.readBits(5);
				if (var6 > 15) {
					var6 -= 32;
				}
			}

			int var8 = Client.defaultRotations[var1.readBits(3)];
			if (var3) {
				var4.orientation = var4.rotation = var8;
			}

			int var9 = var1.readBits(1);
			if (var9 == 1) {
				Client.field662[++Client.field661 - 1] = var2;
			}

			boolean var10 = var1.readBits(1) == 1;
			if (var10) {
				var1.readBits(32);
			}

			int var5 = var1.readBits(1);
			var4.field1211 = var4.definition.size;
			var4.field1261 = var4.definition.rotation;
			if (var4.field1261 == 0) {
				var4.rotation = 0;
			}

			var4.walkSequence = var4.definition.walkSequence;
			var4.walkBackSequence = var4.definition.walkBackSequence;
			var4.walkLeftSequence = var4.definition.walkLeftSequence;
			var4.walkRightSequence = var4.definition.walkRightSequence;
			var4.idleSequence = var4.definition.idleSequence;
			var4.turnLeftSequence = var4.definition.turnLeftSequence;
			var4.turnRightSequence = var4.definition.turnRightSequence;
			var4.method2267(class35.localPlayer.pathX[0] + var6, class35.localPlayer.pathY[0] + var7, var5 == 1);
		}

		var1.exportIndex();
		SequenceDefinition.method3086(var1);

		for (var2 = 0; var2 < Client.field737; ++var2) {
			int var11 = Client.field614[var2];
			if (Client.npcs[var11].npcCycle != Client.cycle) {
				Client.npcs[var11].definition = null;
				Client.npcs[var11] = null;
			}
		}

		if (var1.offset != Client.packetWriter.serverPacketLength) {
			throw new RuntimeException(var1.offset + "," + Client.packetWriter.serverPacketLength);
		} else {
			for (var2 = 0; var2 < Client.npcCount; ++var2) {
				if (Client.npcs[Client.npcIndices[var2]] == null) {
					throw new RuntimeException(var2 + "," + Client.npcCount);
				}
			}

		}
	}
}
