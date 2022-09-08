import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pr")
@Implements("BufferedFile")
public class BufferedFile {
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	@Export("accessFile")
	AccessFile accessFile;
	@ObfuscatedName("f")
	@Export("readBuffer")
	byte[] readBuffer;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		longValue = -9156886384138003879L
	)
	@Export("readBufferOffset")
	long readBufferOffset;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -863439335
	)
	@Export("readBufferLength")
	int readBufferLength;
	@ObfuscatedName("w")
	@Export("writeBuffer")
	byte[] writeBuffer;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = 7536993522266733629L
	)
	@Export("writeBufferOffset")
	long writeBufferOffset;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1232611171
	)
	@Export("writeBufferLength")
	int writeBufferLength;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		longValue = 1425249340355180217L
	)
	@Export("offset")
	long offset;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		longValue = 2959308071768893891L
	)
	@Export("fileLength")
	long fileLength;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		longValue = 5122037250960710265L
	)
	@Export("length")
	long length;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = 4478787705168841771L
	)
	@Export("fileOffset")
	long fileOffset;

	@ObfuscatedSignature(
		descriptor = "(Lpk;II)V"
	)
	public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
		this.readBufferOffset = -1L; // L: 9
		this.writeBufferOffset = -1L; // L: 12
		this.writeBufferLength = 0; // L: 13
		this.accessFile = var1; // L: 20
		this.length = this.fileLength = var1.length(); // L: 21
		this.readBuffer = new byte[var2]; // L: 22
		this.writeBuffer = new byte[var3]; // L: 23
		this.offset = 0L; // L: 24
	} // L: 25

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1497470940"
	)
	@Export("close")
	public void close() throws IOException {
		this.flush(); // L: 28
		this.accessFile.close(); // L: 29
	} // L: 30

	@ObfuscatedName("p")
	@Export("seek")
	public void seek(long var1) throws IOException {
		if (var1 < 0L) { // L: 33
			throw new IOException("");
		} else {
			this.offset = var1; // L: 34
		}
	} // L: 35

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "374254096"
	)
	@Export("length")
	public long length() {
		return this.length; // L: 38
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "4"
	)
	@Export("readFully")
	public void readFully(byte[] var1) throws IOException {
		this.read(var1, 0, var1.length); // L: 42
	} // L: 43

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "-4"
	)
	@Export("read")
	public void read(byte[] var1, int var2, int var3) throws IOException {
		try {
			if (var3 + var2 > var1.length) { // L: 47
				throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
			}

			if (-1L != this.writeBufferOffset && this.offset >= this.writeBufferOffset && (long)var3 + this.offset <= this.writeBufferOffset + (long)this.writeBufferLength) { // L: 48
				System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var1, var2, var3); // L: 49
				this.offset += (long)var3; // L: 50
				return; // L: 51
			}

			long var4 = this.offset; // L: 53
			int var7 = var3; // L: 55
			int var8;
			if (this.offset >= this.readBufferOffset && this.offset < (long)this.readBufferLength + this.readBufferOffset) { // L: 56
				var8 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset)); // L: 57
				if (var8 > var3) { // L: 58
					var8 = var3;
				}

				System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), var1, var2, var8); // L: 59
				this.offset += (long)var8; // L: 60
				var2 += var8; // L: 61
				var3 -= var8; // L: 62
			}

			if (var3 > this.readBuffer.length) { // L: 64
				this.accessFile.seek(this.offset); // L: 65

				for (this.fileOffset = this.offset; var3 > 0; var3 -= var8) { // L: 66 67 73
					var8 = this.accessFile.read(var1, var2, var3); // L: 68
					if (var8 == -1) { // L: 69
						break;
					}

					this.fileOffset += (long)var8; // L: 70
					this.offset += (long)var8; // L: 71
					var2 += var8; // L: 72
				}
			} else if (var3 > 0) { // L: 76
				this.load(); // L: 77
				var8 = var3; // L: 78
				if (var3 > this.readBufferLength) { // L: 79
					var8 = this.readBufferLength;
				}

				System.arraycopy(this.readBuffer, 0, var1, var2, var8); // L: 80
				var2 += var8; // L: 81
				var3 -= var8; // L: 82
				this.offset += (long)var8; // L: 83
			}

			if (-1L != this.writeBufferOffset) { // L: 85
				if (this.writeBufferOffset > this.offset && var3 > 0) { // L: 86
					var8 = var2 + (int)(this.writeBufferOffset - this.offset); // L: 87
					if (var8 > var3 + var2) { // L: 88
						var8 = var3 + var2;
					}

					while (var2 < var8) { // L: 89
						var1[var2++] = 0; // L: 90
						--var3; // L: 91
						++this.offset; // L: 92
					}
				}

				long var13 = -1L; // L: 95
				long var10 = -1L; // L: 96
				if (this.writeBufferOffset >= var4 && this.writeBufferOffset < (long)var7 + var4) { // L: 97
					var13 = this.writeBufferOffset; // L: 98
				} else if (var4 >= this.writeBufferOffset && var4 < this.writeBufferOffset + (long)this.writeBufferLength) { // L: 100
					var13 = var4; // L: 101
				}

				if ((long)this.writeBufferLength + this.writeBufferOffset > var4 && (long)this.writeBufferLength + this.writeBufferOffset <= var4 + (long)var7) { // L: 103
					var10 = (long)this.writeBufferLength + this.writeBufferOffset; // L: 104
				} else if ((long)var7 + var4 > this.writeBufferOffset && (long)var7 + var4 <= this.writeBufferOffset + (long)this.writeBufferLength) { // L: 106
					var10 = var4 + (long)var7; // L: 107
				}

				if (var13 > -1L && var10 > var13) { // L: 109
					int var12 = (int)(var10 - var13); // L: 110
					System.arraycopy(this.writeBuffer, (int)(var13 - this.writeBufferOffset), var1, (int)(var13 - var4) + var2, var12); // L: 111
					if (var10 > this.offset) { // L: 112
						var3 = (int)((long)var3 - (var10 - this.offset)); // L: 113
						this.offset = var10; // L: 114
					}
				}
			}
		} catch (IOException var16) { // L: 120
			this.fileOffset = -1L; // L: 121
			throw var16; // L: 122
		}

		if (var3 > 0) { // L: 124
			throw new EOFException();
		}
	} // L: 125

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1784490163"
	)
	@Export("load")
	void load() throws IOException {
		this.readBufferLength = 0; // L: 128
		if (this.fileOffset != this.offset) { // L: 129
			this.accessFile.seek(this.offset); // L: 130
			this.fileOffset = this.offset; // L: 131
		}

		int var2;
		for (this.readBufferOffset = this.offset; this.readBufferLength < this.readBuffer.length; this.readBufferLength += var2) { // L: 133 134 140
			int var1 = this.readBuffer.length - this.readBufferLength; // L: 135
			if (var1 > 200000000) { // L: 136
				var1 = 200000000;
			}

			var2 = this.accessFile.read(this.readBuffer, this.readBufferLength, var1); // L: 137
			if (var2 == -1) { // L: 138
				break;
			}

			this.fileOffset += (long)var2; // L: 139
		}

	} // L: 142

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "([BIIB)V",
		garbageValue = "1"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		try {
			if ((long)var3 + this.offset > this.length) { // L: 146
				this.length = (long)var3 + this.offset;
			}

			if (this.writeBufferOffset != -1L && (this.offset < this.writeBufferOffset || this.offset > (long)this.writeBufferLength + this.writeBufferOffset)) { // L: 147
				this.flush(); // L: 148
			}

			if (this.writeBufferOffset != -1L && (long)var3 + this.offset > this.writeBufferOffset + (long)this.writeBuffer.length) { // L: 150
				int var4 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset)); // L: 151
				System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var4); // L: 152
				this.offset += (long)var4; // L: 153
				var2 += var4; // L: 154
				var3 -= var4; // L: 155
				this.writeBufferLength = this.writeBuffer.length; // L: 156
				this.flush(); // L: 157
			}

			if (var3 <= this.writeBuffer.length) { // L: 159
				if (var3 > 0) { // L: 188
					if (this.writeBufferOffset == -1L) { // L: 189
						this.writeBufferOffset = this.offset;
					}

					System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var3); // L: 190
					this.offset += (long)var3; // L: 191
					if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) { // L: 192
						this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
					}

				}
			} else {
				if (this.offset != this.fileOffset) { // L: 160
					this.accessFile.seek(this.offset); // L: 161
					this.fileOffset = this.offset; // L: 162
				}

				this.accessFile.write(var1, var2, var3); // L: 164
				this.fileOffset += (long)var3; // L: 165
				if (this.fileOffset > this.fileLength) { // L: 166
					this.fileLength = this.fileOffset;
				}

				long var9 = -1L; // L: 167
				long var6 = -1L; // L: 168
				if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) { // L: 169
					var9 = this.offset; // L: 170
				} else if (this.readBufferOffset >= this.offset && this.readBufferOffset < this.offset + (long)var3) { // L: 172
					var9 = this.readBufferOffset; // L: 173
				}

				if ((long)var3 + this.offset > this.readBufferOffset && this.offset + (long)var3 <= this.readBufferOffset + (long)this.readBufferLength) { // L: 175
					var6 = (long)var3 + this.offset; // L: 176
				} else if (this.readBufferOffset + (long)this.readBufferLength > this.offset && this.readBufferOffset + (long)this.readBufferLength <= this.offset + (long)var3) { // L: 178
					var6 = (long)this.readBufferLength + this.readBufferOffset; // L: 179
				}

				if (var9 > -1L && var6 > var9) { // L: 181
					int var8 = (int)(var6 - var9); // L: 182
					System.arraycopy(var1, (int)(var9 + (long)var2 - this.offset), this.readBuffer, (int)(var9 - this.readBufferOffset), var8); // L: 183
				}

				this.offset += (long)var3; // L: 185
			}
		} catch (IOException var12) { // L: 196
			this.fileOffset = -1L; // L: 197
			throw var12; // L: 198
		}
	} // L: 186 193 200

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "978727551"
	)
	@Export("flush")
	void flush() throws IOException {
		if (-1L != this.writeBufferOffset) { // L: 203
			if (this.writeBufferOffset != this.fileOffset) { // L: 204
				this.accessFile.seek(this.writeBufferOffset); // L: 205
				this.fileOffset = this.writeBufferOffset; // L: 206
			}

			this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength); // L: 208
			this.fileOffset += 1232611171L * (long)(this.writeBufferLength * 1446154827); // L: 209
			if (this.fileOffset > this.fileLength) { // L: 210
				this.fileLength = this.fileOffset;
			}

			long var1 = -1L; // L: 211
			long var3 = -1L; // L: 212
			if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < (long)this.readBufferLength + this.readBufferOffset) { // L: 213
				var1 = this.writeBufferOffset; // L: 214
			} else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < (long)this.writeBufferLength + this.writeBufferOffset) { // L: 216
				var1 = this.readBufferOffset; // L: 217
			}

			if (this.writeBufferOffset + (long)this.writeBufferLength > this.readBufferOffset && this.writeBufferOffset + (long)this.writeBufferLength <= (long)this.readBufferLength + this.readBufferOffset) { // L: 219
				var3 = this.writeBufferOffset + (long)this.writeBufferLength; // L: 220
			} else if (this.readBufferOffset + (long)this.readBufferLength > this.writeBufferOffset && this.readBufferOffset + (long)this.readBufferLength <= this.writeBufferOffset + (long)this.writeBufferLength) { // L: 222
				var3 = (long)this.readBufferLength + this.readBufferOffset; // L: 223
			}

			if (var1 > -1L && var3 > var1) { // L: 225
				int var5 = (int)(var3 - var1); // L: 226
				System.arraycopy(this.writeBuffer, (int)(var1 - this.writeBufferOffset), this.readBuffer, (int)(var1 - this.readBufferOffset), var5); // L: 227
			}

			this.writeBufferOffset = -1L; // L: 229
			this.writeBufferLength = 0; // L: 230
		}

	} // L: 232

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-156540617"
	)
	static int method7715(int var0, Script var1, boolean var2) {
		boolean var3 = true; // L: 849
		Widget var4;
		if (var0 >= 2000) { // L: 851
			var0 -= 1000; // L: 852
			var4 = SpotAnimationDefinition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]); // L: 853
			var3 = false; // L: 854
		} else {
			var4 = var2 ? TextureProvider.scriptDotWidget : MenuAction.scriptActiveWidget; // L: 856
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) { // L: 857
			var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 858
			if (var11 >= 0 && var11 <= 9) { // L: 859
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]); // L: 863
				return 1; // L: 864
			} else {
				--VarbitComposition.Interpreter_stringStackSize; // L: 860
				return 1; // L: 861
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) { // L: 866
				Interpreter.Interpreter_intStackSize -= 2; // L: 867
				var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 868
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 869
				var4.parent = JagexCache.getWidgetChild(var11, var6); // L: 870
				return 1; // L: 871
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) { // L: 873
				var4.isScrollBar = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 874
				return 1; // L: 875
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) { // L: 877
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 878
				return 1; // L: 879
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) { // L: 881
				var4.dragThreshold = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 882
				return 1; // L: 883
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) { // L: 885
				var4.dataText = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 886
				return 1; // L: 887
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) { // L: 889
				var4.spellActionName = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 890
				return 1; // L: 891
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) { // L: 893
				var4.actions = null; // L: 894
				return 1; // L: 895
			} else if (var0 == 1308) { // L: 897
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 898
				return 1; // L: 899
			} else if (var0 == 1309) { // L: 901
				--Interpreter.Interpreter_intStackSize; // L: 902
				return 1; // L: 903
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) { // L: 905
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) { // L: 935
						Interpreter.Interpreter_intStackSize -= 2; // L: 936
						var5 = 10; // L: 937
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 938
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 939
						class151.Widget_setKey(var4, var5, var8, var9); // L: 940
						return 1; // L: 941
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) { // L: 943
						Interpreter.Interpreter_intStackSize -= 3; // L: 944
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 945
						var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 946
						var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 947
						if (var11 >= 0 && var11 <= 9) { // L: 948
							WorldMapRegion.Widget_setKeyRate(var4, var11, var6, var7); // L: 951
							return 1; // L: 952
						} else {
							throw new RuntimeException(); // L: 949
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) { // L: 954
						var5 = 10; // L: 955
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 956
						var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 957
						WorldMapRegion.Widget_setKeyRate(var4, var5, var6, var7); // L: 958
						return 1; // L: 959
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) { // L: 961
						--Interpreter.Interpreter_intStackSize; // L: 962
						var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] - 1; // L: 963
						if (var11 >= 0 && var11 <= 9) { // L: 964
							TileItem.Widget_setKeyIgnoreHeld(var4, var11); // L: 967
							return 1; // L: 968
						} else {
							throw new RuntimeException(); // L: 965
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) { // L: 970
						var5 = 10; // L: 971
						TileItem.Widget_setKeyIgnoreHeld(var4, var5); // L: 972
						return 1; // L: 973
					} else {
						return 2; // L: 975
					}
				} else {
					byte[] var10 = null; // L: 906
					var8 = null; // L: 907
					if (var3) { // L: 908
						Interpreter.Interpreter_intStackSize -= 10; // L: 909

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize] >= 0; var7 += 2) { // L: 911 912
						}

						if (var7 > 0) { // L: 914
							var10 = new byte[var7 / 2]; // L: 915
							var8 = new byte[var7 / 2]; // L: 916

							for (var7 -= 2; var7 >= 0; var7 -= 2) { // L: 917
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize]; // L: 918
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + Interpreter.Interpreter_intStackSize + 1]; // L: 919
							}
						}
					} else {
						Interpreter.Interpreter_intStackSize -= 2; // L: 924
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]}; // L: 925
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]}; // L: 926
					}

					var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] - 1; // L: 928
					if (var7 >= 0 && var7 <= 9) { // L: 929
						class151.Widget_setKey(var4, var7, var10, var8); // L: 932
						return 1; // L: 933
					} else {
						throw new RuntimeException(); // L: 930
					}
				}
			}
		}
	}
}
